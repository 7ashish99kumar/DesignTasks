package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class DownDirection implements Directions {

    @Override
    public Coordinate move(Coordinate c, int N) {
        Coordinate nc = new Coordinate(c.getX(), c.getY()-1);
        if (nc.isValid(N)) {
            System.out.println("Moved Downwards");
            return nc;
        }
        return null;
    }
}
