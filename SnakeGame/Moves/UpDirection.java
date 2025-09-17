package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class UpDirection implements Directions {

    @Override
    public Coordinate move(Coordinate c, int N) {
        c.setY(c.getY() + 1);
        if (c.isValid(N)) {
            System.out.println("Moved Up");
            return c;
        }
        return null;
    }
}
