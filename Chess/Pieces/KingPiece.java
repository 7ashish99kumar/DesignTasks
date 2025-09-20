package Chess.Pieces;

import static Chess.Pieces.Symbol.KING;

public class KingPiece extends Piece {

    public KingPiece(String color) {
        super(KING, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        return x + y == 1;
    }
}
