package SnakeGame;

import SnakeGame.Moves.DirectionType;
import SnakeGame.Moves.MovementProcessor;

import java.util.*;

import static SnakeGame.Moves.DirectionType.*;

public class Snake {

    private static Snake instance;
    private Deque<Coordinate> snakeCoords;
    private HashMap<Coordinate, Boolean> coordMap;

    private Snake(Deque<Coordinate> snakeCoords, HashMap<Coordinate, Boolean> coordMap){
        this.snakeCoords = snakeCoords;
        this.coordMap = coordMap;
    };

    public static Snake getInstance() {
        if(instance == null) {
            Deque<Coordinate> snakeCoords = new LinkedList<>();
            Coordinate coord = new Coordinate(0,0);
            snakeCoords.add(coord);
            HashMap<Coordinate, Boolean> coordMap = new HashMap<>();
            coordMap.put(coord,Boolean.TRUE);
            instance = new Snake(snakeCoords, coordMap);
        }
        return instance;
    }

    public Deque<Coordinate> getSnakeCoords() {
        return snakeCoords;
    }

    public void setSnakeCoords(Deque<Coordinate> snakeCoords) {
        this.snakeCoords = snakeCoords;
    }

    public HashMap<Coordinate, Boolean> getCoordMap() {
        return coordMap;
    }

    public void setCoordMap(HashMap<Coordinate, Boolean> coordMap) {
        this.coordMap = coordMap;
    }

    public boolean moveSnake(Coordinate curr, Coordinate food, int N) {
        List<DirectionType> dts = findOptimalPath(curr, food);
        for(DirectionType dt : dts) {
            Coordinate newCoord = MovementProcessor.processMove(dt,curr,N);
            if(newCoord == null) {
                return false;
            }
            boolean ateFood = newCoord.getX()==food.getX() && newCoord.getY()==food.getY();
            if(isBite(newCoord,N,ateFood)) {
                return false;
            }
            if(!ateFood) {
                Coordinate tailedCoord = this.snakeCoords.pollLast();
                this.coordMap.remove(tailedCoord);
            }
            this.snakeCoords.addFirst(newCoord);
            this.coordMap.put(newCoord, Boolean.TRUE);
            curr=newCoord;
        }
        return true;
    }

    public boolean isBite(Coordinate curr, int N, boolean ateFood) {
        if(!curr.isValid(N)) return true;

        // Check self-collision (but allow moving into tail if not eating food)
        if(this.coordMap.containsKey(curr)) {
            if(ateFood) return true; // Can't eat food on own body

            // Allow moving into tail position only if we're about to remove it
            Coordinate tail = this.snakeCoords.peekLast();
            return !(curr.getX() == tail.getX() && curr.getY() == tail.getY());
        }
        return false;
    }

    public List findOptimalPath(Coordinate curr, Coordinate food) {
        System.out.println("Snake curr coord : " + curr.getX() + " : " + curr.getY());
        System.out.println("Food curr coord : " + food.getX() + " : " + food.getY());
        List response = new ArrayList<>();
        int diffX = curr.getX()-food.getX();
        while(diffX<0) {
            response.add(RIGHT);
            diffX++;
        }
        while(diffX>0) {
            response.add(LEFT);
            diffX--;
        }
        int diffY = curr.getY()-food.getY();
        while(diffY<0) {
            response.add(UP);
            diffY++;
        }
        while(diffY>0) {
            response.add(DOWN);
            diffY--;
        }
        return response;
    }

}
