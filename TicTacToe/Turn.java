package TicTacToe;

import java.util.List;

public class Turn {

    private List<Player> players;
    int counter;

    public Turn(List<Player> players) {
        this.players = players;
        counter = 0;
    }

    public synchronized Player turn() {
        Player p = players.get(counter);
        counter++;counter%=players.size();
        return p;
    }
}
