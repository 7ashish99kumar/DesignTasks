package SnakeGame;

import java.util.HashMap;
import java.util.Random;

public class Food {

    private Coordinate coord;

    public Food(Coordinate coord) {
        this.coord = coord;
    }

    public static Food generateFood(int N, HashMap<Coordinate, Boolean> snakeBody) {
        Random r = new Random();
        Coordinate coord;
        int tries = N*N;
        do {
            tries--;
            if(tries<0) {
                return null;
            }
            coord = new Coordinate(r.nextInt(N), r.nextInt(N));
        } while (snakeBody.containsKey(coord));
        return new Food(coord);
    }

    public Coordinate getCoord() {
        return this.coord;
    }
}
