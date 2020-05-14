import java.util.List;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        
        printGameBoard(gameBoard);


    }

    private static int getInput( Scanner input ) {
        int i;
        if ( input.hasNextInt() ) {
            i = input.nextInt();
        } else {
            System.out.println( "Invalid input" );
            input.next();
            i = getInput( input );
        }
        if ( i >= 1 && i <= 9 ) {
            return i;
        } else {
            System.out.println( "Invalid input" );
            return getInput( input );
        }
    }

    public static String checkWinner(List<Integer> playerPositions1, List<Integer> playerPositions2){


        
}
}