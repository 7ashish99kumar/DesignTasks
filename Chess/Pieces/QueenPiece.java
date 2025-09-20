package Chess.Pieces;

import static Chess.Pieces.Symbol.QUEEN;

public class QueenPiece extends Piece {


    public QueenPiece(String color) {
        super(QUEEN, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        if (x == 0 || y == 0) return true;
        return x == y;
    }
}
