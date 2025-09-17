package SnakeGame;

import SnakeGame.Moves.DirectionType;
import SnakeGame.Moves.MovementProcessor;

import java.util.ArrayList;
import java.util.List;

import static SnakeGame.Moves.DirectionType.RIGHT;
import static SnakeGame.Moves.DirectionType.UP;

public class Snake {

    private static Snake instance;
    private Coordinate coord;
    private int length;

    private Snake(int l, Coordinate c){
        this.length = l;
        this.coord = c;
    };

    public static Snake getInstance() {
        if(instance == null) {
            return new Snake(1, new Coordinate(0,0));
        }
        return instance;
    }

    public Coordinate getCoord() {
        return coord;
    }

    public void setCoord(Coordinate coord) {
        this.coord = coord;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void moveSnake(Coordinate curr, Coordinate food, int N) {
        List<DirectionType> dts = findOptimalPath(curr, food);
        for(DirectionType dt : dts) {
            MovementProcessor.processMove(dt,curr,N);
        }
        this.length++;
    }

    public List findOptimalPath(Coordinate curr, Coordinate food) {
        List response = new ArrayList<>();
        response.add(RIGHT);
        response.add(UP);
        return response;
    }

}
