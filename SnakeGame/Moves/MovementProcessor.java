package SnakeGame.Moves;

import SnakeGame.Coordinate;

public class MovementProcessor {

    public static Directions directionBuilder(DirectionType dt) {
        switch(dt) {
            case LEFT :
                return new LeftDirection();
            case RIGHT :
                return new RightDirection();
            case UP :
                return new UpDirection();
            case DOWN :
                return new DownDirection();
        }
        return null;
    }

    public static Coordinate processMove(DirectionType dt, Coordinate initial, int N) {
        Directions direction = directionBuilder(dt);
        return direction.move(initial, N);
    }

}
