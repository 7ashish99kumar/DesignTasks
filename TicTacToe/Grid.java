package TicTacToe;

import java.util.List;

public class Grid {

    private static Grid instance;
    int N;
    char[][] tics;
    List<Player> players;
    Turn t;

    private Grid(List<Player> players) {
        N = 3;
        tics = new char[N][N];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tics[i][j] = '_';
            }
        }
        this.players = players;
        this.t = new Turn(players);
    }

    public Turn getT() {
        return t;
    }

    public static Grid getInstance(List<Player> players) {
        if (instance == null) {
            synchronized (Grid.class) {
                if (instance == null) {
                    instance = new Grid(players);
                }
            }
        }
        return instance;
    }

    public boolean isValid(int r, int c) {
        return (r >= 0 && r < N && c >= 0 && c < N && tics[r][c] == '_');
    }

    private boolean isWin(Player player, int r, int c) {
        boolean isWinner = true;
        for (int i = 0; i < N; i++) {
            if (tics[i][c] != player.getPlayerSign()) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) return true;
        for (int i = 0; i < N; i++) {
            if (tics[r][i] != player.getPlayerSign()) {
                isWinner = false;
                break;
            }
        }
        if (isWinner) return true;
        if (tics[0][0] == tics[1][1] && tics[1][1] == tics[2][2] && tics[0][0] == player.getPlayerSign()) {
            return true;
        }
        if (tics[0][2] == tics[1][1] && tics[1][1] == tics[2][0] && tics[0][2] == player.getPlayerSign()) {
            return true;
        }
        return false;
    }

    public void displayGrid() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(tics[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isDraw() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (tics[i][j] == '_') return false;
            }
        }
        return true;
    }

    public boolean makeMove(Player player, int r, int c) {
        if (isValid(r, c)) {
            tics[r][c] = player.getPlayerSign();
            if (isWin(player, r, c)) {
                System.out.println("Player " + player.getPlayerSign() + " won the game");
                return true;
            }
        } else {
            throw new IllegalStateException("Invalid move by player : " + player.getPlayerSign());
        }
        return false;
    }


}
