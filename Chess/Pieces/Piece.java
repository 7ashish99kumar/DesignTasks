package Chess.Pieces;

public abstract class Piece {
    private Symbol name;
    private String color;
    boolean isAlive;

    public Piece(Symbol name, String color) {
        this.name = name;
        this.color = color;
        this.isAlive = true;
    }

    public Symbol getName() {
        return name;
    }

    public void setName(Symbol name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public abstract boolean move(Coordinate initial, Coordinate next);

    @Override
    public String toString() {
        if (isAlive) {
            return color + " " + name;
        }
        return "_";
    }
}
