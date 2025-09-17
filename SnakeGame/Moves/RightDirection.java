package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class RightDirection implements Directions {
    @Override
    public Coordinate move(Coordinate c, int N) {
        int currX = c.getX();
        c.setX(currX + 1);
        if (c.isValid(N)) {
            System.out.println("Moved Right");
            return c;
        }
        return null;
    }
}
