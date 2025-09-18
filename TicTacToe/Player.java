package TicTacToe;

public abstract class Player {

    private int playerId;

    private char playerSign;

    private MoveStrategy move;

    public Player(int playerId, char playerSign, MoveStrategy move) {
        this.playerId = playerId;
        this.playerSign = playerSign;
        this.move = move;
    }

    public MoveStrategy getMove() {
        return move;
    }

    public void setMove(MoveStrategy move) {
        this.move = move;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public char getPlayerSign() {
        return playerSign;
    }

    public void setPlayerSign(char playerSign) {
        this.playerSign = playerSign;
    }
}
