package TicTacToe;

public class PlayerO extends Player {

    public PlayerO(int playerId) {
        super(playerId, 'O', new HumanInputStrategy());
    }

}
