package Chess;

import Chess.Pieces.Coordinate;

import static Chess.Pieces.Symbol.EMPTY;

public class Board {

    int N;
    Coordinate[][] board;
    private static Board instance;

    private Board(int n) {
        N = n;
        this.board = new Coordinate[N][N];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                board[i][j]=new Coordinate(0,0, null);
            }
        }
    }

    public static Board getInstance(int n) {
        if(instance == null) {
            instance = new Board(n);
        }
        return instance;
    }

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public Coordinate[][] getBoard() {
        return board;
    }

    public void setBoard(Coordinate[][] board) {
        this.board = board;
    }

    public void display() {
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++) {
                String c = board[i][j].getPiece()==null ? "_" : board[i][j].getPiece().toString();
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

}
