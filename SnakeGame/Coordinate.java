package SnakeGame;

public class Coordinate {

    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isValid(int N) {
        int x= this.x;
        int y = this.y;
        return (x>=0 && x<N && y>=0 && y<N);
    }
}
