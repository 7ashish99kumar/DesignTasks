package Chess.Player;

import Chess.MoveStrategy;
import Chess.Pieces.Coordinate;
import Chess.Pieces.Piece;

import java.util.List;

public abstract class Player {

    private String name;

    List<Coordinate> pieces;

    MoveStrategy moveStrategy;

    public Player(String name, List<Coordinate> pieces, MoveStrategy strategy) {
        this.name = name;
        this.pieces = pieces;
        this.moveStrategy = strategy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Coordinate> getPieces() {
        return pieces;
    }

    public void setPieces(List<Coordinate> pieces) {
        this.pieces = pieces;
    }

    public MoveStrategy getMoveStrategy() {
        return moveStrategy;
    }

    public void setMoveStrategy(MoveStrategy moveStrategy) {
        this.moveStrategy = moveStrategy;
    }

    public boolean isKilling(Coordinate initial, Coordinate next) {
        if (initial.getPiece().getColor() != next.getPiece().getColor()) {
            System.out.println(next.getPiece().getColor() + " " + next.getPiece().getName() + " killed by " +
                    initial.getPiece().getColor() + " " + initial.getPiece().getName());
            return true;
        }
        return false;
    }

    public boolean isValidMove(Coordinate initial, Coordinate next) {
        if (next == null || !next.isValidCoord()) {
            return false;
        }
        if (!initial.getPiece().move(initial, next)) {
            return false;
        }
        if (isKilling(initial, next)) {
            next.getPiece().setAlive(false);
        }
        next.setPiece(initial.getPiece());
        initial.setPiece(null);
        return true;
    }

}
