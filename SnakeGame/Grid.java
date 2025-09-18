package SnakeGame;

public class Grid {

    private static Grid instance;
    private int N;
    private Snake snake;
    private Food currentFood;

    private Grid(int n) {
        this.N = n;
        this.snake = Snake.getInstance();
    }

    public static Grid getGridInstance(int N) {
        if(instance == null) {
            instance = new Grid(N);
        }
        return instance;
    }

    public int getSize() {
        return N;
    }

    public Food generateNewFood() {
        this.currentFood = Food.generateFood(N, snake.getCoordMap());
        return currentFood;
    }

    public Food getCurrentFood() {
        return currentFood;
    }

    public boolean isGameOver() {
        return currentFood == null || snake.getSnakeCoords().size() >= N * N;
    }

    public boolean moveSnake() {
        if (currentFood == null) return false;
        return snake.moveSnake(snake.getSnakeCoords().getFirst(), currentFood.getCoord(), N);
    }

    public void displayGrid() {
        char[][] grid = new char[N][N];
        
        // Initialize empty grid
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                grid[i][j] = '.';
            }
        }
        
        // Place snake
        for(Coordinate coord : snake.getSnakeCoords()) {
            grid[coord.getY()][coord.getX()] = 'S';
        }
        
        // Place snake head
        Coordinate head = snake.getSnakeCoords().getFirst();
        grid[head.getY()][head.getX()] = 'H';
        
        // Place food
        if(currentFood != null) {
            Coordinate foodCoord = currentFood.getCoord();
            grid[foodCoord.getY()][foodCoord.getX()] = 'F';
        }
        
        // Print grid
        for(int i = N-1; i >= 0; i--) {
            for(int j = 0; j < N; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
