package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class UpDirection implements Directions {

    @Override
    public Coordinate move(Coordinate c, int N) {
        Coordinate nc = new Coordinate(c.getX(), c.getY()+1);
        if (nc.isValid(N)) {
            System.out.println("Moved Up");
            return nc;
        }
        return null;
    }
}
