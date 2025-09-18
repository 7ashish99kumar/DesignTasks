package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class LeftDirection implements Directions {

    @Override
    public Coordinate move(Coordinate c, int N) {
        Coordinate nc = new Coordinate(c.getX()-1, c.getY());
        if (nc.isValid(N)) {
            System.out.println("Moved Left");
            return nc;
        }
        return null;
    }
}
