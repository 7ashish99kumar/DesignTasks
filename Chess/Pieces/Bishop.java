package Chess.Pieces;

import static Chess.Pieces.Symbol.BISHOP;

public class Bishop extends Piece {
    public Bishop(String color) {
        super(BISHOP, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        return x == y;
    }
}
