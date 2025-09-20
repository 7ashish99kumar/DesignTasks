package Chess.Pieces;

public class Coordinate {

    int r;
    int c;
    Piece piece;

    public Coordinate(int r, int c, Piece p) {
        this.piece = p;
        this.r = r;
        this.c = c;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isValidCoord() {
        return this.r>=0 && this.r<8 && this.c>=0 && this.c<8;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null)return false;
        Coordinate coord = (Coordinate)obj;
        return coord.r == this.r && coord.c == this.c;
    }

}
