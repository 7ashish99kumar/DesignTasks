package Chess.Player;

import Chess.MoveStrategy;
import Chess.Pieces.Coordinate;
import Chess.Pieces.Piece;

import java.util.List;

public class WhitePlayer extends Player {

    public WhitePlayer(String name, List<Coordinate> pieces, MoveStrategy strategy) {
        super(name, pieces, strategy);
    }
}
