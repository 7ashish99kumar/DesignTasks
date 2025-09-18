package SnakeGame;

public class SnakeGameApp {

    public static void main(String[] args) {
        int N = 10;
        Grid grid = Grid.getGridInstance(N);
        
        int maxMoves = 100;
        for(int move = 1; move <= maxMoves; move++) {
            System.out.println("=== Move " + move + " ===");
            
            // Generate new food
            Food food = grid.generateNewFood();
            if(grid.isGameOver()) {
                System.out.println("Game Over: No space for food!");
                break;
            }
            
            // Display current state
            grid.displayGrid();
            
            // Move snake
            boolean validMove = grid.moveSnake();
            if(!validMove) {
                System.out.println("Game Over: Snake collision!");
                break;
            }
            
            System.out.println("Snake Length: " + Snake.getInstance().getSnakeCoords().size());
            
            // Check win condition
            if(Snake.getInstance().getSnakeCoords().size() >= N * N) {
                System.out.println("You Win! Snake filled the entire grid!");
                break;
            }
        }
        
        System.out.println("Final snake length: " + Snake.getInstance().getSnakeCoords().size());
        grid.displayGrid();
    }
}
