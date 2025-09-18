package TicTacToe;

public class PlayerFactory {

    public static Player getPlayer(char sign) {
        switch(sign) {
            case 'X' :
                return new PlayerX(1);
            case 'O' :
                return new PlayerO(2);
            default :
                throw new IllegalStateException("Invalid Player Sign");
        }
    }

}
