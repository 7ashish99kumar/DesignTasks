package Chess;

import Chess.Player.Player;
import Chess.Player.PlayerFactory;

public class ChessPlay {

    private static void init(Player white, Player black, Board board) {
        white.getPieces().forEach(p -> {
            board.getBoard()[p.getR()][p.getC()] = p;
        });
        black.getPieces().forEach(p -> {
            board.getBoard()[p.getR()][p.getC()] = p;
        });
    }

    public static void main(String[] args) {

        Player white = PlayerFactory.createPlayer("WHITE");
        Player black = PlayerFactory.createPlayer("BLACK");

        Board board = Board.getInstance(8);
        init(white, black, board);

        int turn = 0;
        while (true) {
            System.out.println("Current Board -> ");
            board.display();
            String color = (turn == 0 ? "WHITE" : "BLACK");
            Player current = (turn == 0 ? white : black);
            current.getMoveStrategy().makeMove(current, board);
            turn ^= 1;
        }


    }

}
