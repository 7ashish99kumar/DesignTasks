package SnakeGame;

import java.util.Random;

public class Food {

    private Coordinate coord;

    public Food(Coordinate coord) {
        this.coord = coord;
    }

    public static Food generateFood(int N) {
        Random r = new Random();
        int x = r.nextInt(N);
        int y = r.nextInt(N);
        return new Food(new Coordinate(x, y));
    }

    public Coordinate getCoord() {
        return this.coord;
    }
}
