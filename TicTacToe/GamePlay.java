package TicTacToe;

import java.util.*;

public class GamePlay {

    public static void main(String[] args) {
        Player px = PlayerFactory.getPlayer('X');
        Player po = PlayerFactory.getPlayer('O');
        Grid grid = Grid.getInstance(List.of(px, po));

        while (true) {
            System.out.println("Current grid -> ");
            grid.displayGrid();
            Player player = grid.getT().turn();
            System.out.print("Player : " + player.getPlayerSign() + ",  Enter row and column : ");
            List<Integer> moves = player.getMove().moveCoords(grid);
            int r = moves.get(0), c = moves.get(1);
            boolean winner = grid.makeMove(player, r, c);
            boolean draw = grid.isDraw();
            if (winner) {
                System.out.println("Player " + player.getPlayerSign() + " wins!");
                break;
            } else if(draw) {
                System.out.println("Current game is a draw !");
                break;
            }
        }
    }
}
