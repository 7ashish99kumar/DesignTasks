package Chess;

import Chess.Pieces.Coordinate;
import Chess.Player.Player;

import java.util.Scanner;

public class HumanStrategy implements MoveStrategy {

    @Override
    public boolean makeMove(Player p, Board b) {
        final Scanner scan = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Player " + p.getName() + ", make your turn. Input initial and next coordinates : e.g. (0 0 1 1)");
                int initialR = scan.nextInt();
                int initalC = scan.nextInt();
                int nextR = scan.nextInt();
                int nextC = scan.nextInt();
                Coordinate initial = b.getBoard()[initialR][initalC];
                if (initial.getPiece() == null || p.getName() != initial.getPiece().getColor()) {
                    System.out.println("Invalid Piece Selected, try again");
                    continue;
                }
                Coordinate next = b.getBoard()[nextR][nextC];
                if (p.isValidMove(initial, next)) {
                    b.getBoard()[nextR][nextC]=initial;
                    b.getBoard()[initialR][initalC].setPiece(null);
                    return true;
                }
                System.out.println("Invalid Move, try again");
            } catch (Exception e) {
                System.out.println("Invalid Input Format, try again");
            }
        }
    }


}
