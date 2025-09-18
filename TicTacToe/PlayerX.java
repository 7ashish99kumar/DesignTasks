package TicTacToe;

public class PlayerX extends Player {

    public PlayerX(int playerId) {
        super(playerId, 'X', new HumanInputStrategy());
    }

}
