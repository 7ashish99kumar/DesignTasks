package Chess.Pieces;

import static Chess.Pieces.Symbol.KNIGHT;

public class Knight extends Piece {
    public Knight(String color) {
        super(KNIGHT, color);
    }

    @Override
    public boolean move(Coordinate initial, Coordinate next) {
        if (initial == null || initial.equals(next)) {
            return false;
        }
        int x = Math.abs(initial.r - next.r);
        int y = Math.abs(initial.c - next.c);
        if (x == 1 && y == 2) return true;
        if (x == 2 && y == 1) return true;
        return false;
    }
}
