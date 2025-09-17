package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class DownDirection implements Directions {

    @Override
    public Coordinate move(Coordinate c, int N) {
        c.setY(c.getY() - 1);
        if (c.isValid(N)) {
            System.out.println("Moved Downwards");
            return c;
        }
        return null;
    }
}
