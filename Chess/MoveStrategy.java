package Chess;

import Chess.Player.Player;

public interface MoveStrategy {

    public boolean makeMove(Player p, Board b);

}
