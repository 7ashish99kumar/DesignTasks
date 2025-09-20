package Chess.Pieces;

import static Chess.Pieces.Symbol.ROOK;

public class Rook extends Piece {

    public Rook(String color) {
        super(ROOK, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        return x == 0 || y == 0;
    }
}
