package Chess.Pieces;

import static Chess.Pieces.Symbol.PAWN;

public class Pawn extends Piece {

    public Pawn(String color) {
        super(PAWN, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        if (x > 1 || y > 1) return false;
        if (x == 1 && y == 1 && next.getPiece() != null && next.getPiece().getColor() != initial.getPiece().getColor()) {
            return true;
        }
        return (x + y == 1);
    }
}
