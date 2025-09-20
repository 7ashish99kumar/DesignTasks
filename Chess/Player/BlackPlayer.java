package Chess.Player;

import Chess.MoveStrategy;
import Chess.Pieces.Coordinate;

import java.util.List;

public class BlackPlayer extends Player{


    public BlackPlayer(String name, List<Coordinate> pieces, MoveStrategy strategy) {
        super(name, pieces, strategy);
    }
}
