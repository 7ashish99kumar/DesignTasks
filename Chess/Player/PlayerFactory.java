package Chess.Player;

import Chess.HumanStrategy;
import Chess.Pieces.Coordinate;
import Chess.Pieces.KingPiece;
import Chess.Pieces.*;

import java.util.ArrayList;
import java.util.List;

public class PlayerFactory {

    public static Player createPlayer(String color) {
        Player p;
        List<Coordinate> pieces = new ArrayList<Coordinate>();
        generateCoordinates(pieces,color);
        switch (color) {
            case "WHITE":
                p = new WhitePlayer(color, pieces, new HumanStrategy());
                return p;
            case "BLACK":
                p = new BlackPlayer(color, pieces, new HumanStrategy());
                return p;
        }
        return null;
    }

    private static void generateCoordinates(List<Coordinate> pieces, String color) {
        int row1 = (color == "WHITE" ? 0 : 7);
        Coordinate rook1 = new Coordinate(row1,0, new Rook(color));
        Coordinate rook2 = new Coordinate(row1,7, new Rook(color));
        Coordinate knight1 = new Coordinate(row1,1, new Knight(color));
        Coordinate knight2 = new Coordinate(row1,6, new Knight(color));
        Coordinate bishop1 = new Coordinate(row1, 2, new Bishop(color));
        Coordinate bishop2 = new Coordinate(row1, 5, new Bishop(color));
        Coordinate king = new Coordinate(row1, 3, new KingPiece(color));
        Coordinate queen = new Coordinate(row1, 4, new QueenPiece(color));
        pieces.add(rook1);
        pieces.add(rook2);
        pieces.add(knight1);
        pieces.add(knight2);
        pieces.add(bishop1);
        pieces.add(bishop2);
        pieces.add(king);
        pieces.add(queen);
        int row2 = (color == "WHITE" ? 1 : 6);
        for(int i=0;i<8;i++) {
            Coordinate pawn = new Coordinate(row2,i, new Pawn(color));
            pieces.add(pawn);
        }
    }

}
