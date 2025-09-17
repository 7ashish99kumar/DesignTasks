package SnakeGame;

public class Grid {

    private static Grid instance;
    private int N;
    private Food food;

    private Grid(int n) {
        this.N = n;
    }

    public static Grid getGridInstance(int N) {
        if(instance == null) {
            instance = new Grid(N);
        }
        return instance;
    }

    public Food setFoodCoord() {
        this.food = Food.generateFood(N);
        return food;
    }

    public static void main(String[] args) {
        int N = 10;
        Grid grid = Grid.getGridInstance(N);
        Snake snake = Snake.getInstance();
        int movement = 1;
        while(movement-->0) {
            Food currFood = grid.setFoodCoord();
            snake.moveSnake(snake.getCoord(),currFood.getCoord(), N);
            System.out.println("Length of Snake : " + snake.getLength());
        }
    }



}
