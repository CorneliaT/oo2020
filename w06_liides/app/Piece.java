import java.util.List;

public class Piece {
    public static void placePiece(char [] [] gameBoard, int pos, String user, List<Integer> playerPositions1, List<Integer> playerPositions2){

        char symbol = ' ';
        // Jagab X ja 0 mängijate vahel
        if(user.equals("player1")) {
            symbol = 'X';
            playerPositions1.add(pos);
        }else if(user.equals("player2")){
            symbol = '0';
            playerPositions2.add(pos);
        }
        // Leiab asukohad mängulaual
        switch(pos) {
            case 1:
                gameBoard[0][0] = symbol;
                break;
            case 2:
                gameBoard[0][2] = symbol;
                break;
            case 3:
                gameBoard[0][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[4][0] = symbol;
                break; 
            case 8:
                gameBoard[4][2] = symbol;
                break;
            case 9:
                gameBoard[4][4] = symbol; 
                break;
            default:
                break;
        }
    }
}