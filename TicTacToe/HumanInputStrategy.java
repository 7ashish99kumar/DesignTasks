package TicTacToe;

import java.util.List;
import java.util.Scanner;

public class HumanInputStrategy implements MoveStrategy {
    @Override
    public List<Integer>  moveCoords(Grid grid) {
        Scanner scan = new Scanner(System.in); // create once
        while (true) {
            try {
                int r = scan.nextInt();
                int c = scan.nextInt();
                if (!grid.isValid(r, c)) {
                    System.out.println("Please enter valid inputs in range");
                    continue;
                }
                return List.of(r,c);
            } catch (Exception e) {
                System.out.println("Please enter valid inputs in Integer range");
                scan.nextLine();
            }
        }
    }
}
