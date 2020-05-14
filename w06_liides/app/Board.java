import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Board {



    char [] [] gameBoard = {
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '}};

    
//Prindib mängulaua reahaaval välja
public static void printGameBoard(char [] [] gameBoard){
    for(char[] row : gameBoard){
        for(char c : row){
            System.out.print(c);
        }
        System.out.println();
    }
}

List<Integer> playerPositions1 = new ArrayList<Integer>();
List<Integer> playerPositions2 = new ArrayList<Integer>();

int i = 0;
boolean running = true;
    //While loop, mis kestab kogu mängu vältel. Küsib positsiooni ja kontrollib ega samal kohal juba midagi ei ole.
    Scanner scan = new Scanner(System.in);
    while(running){
        System.out.println("Positsioon 1-9");
        int playerPos = getInput(scan);

        while(playerPositions1.contains(playerPos) || playerPositions2.contains(playerPos)){
            System.out.println("Position taken! Enter another one");
            playerPos = getInput(scan);
        }
        
        i +=1;

        //Jagab mängukorrad player 1 ja 2 vahel.
        placePiece(gameBoard, playerPos, i % 2== 0 ? "player2" : "player1", playerPositions1, playerPositions2);

        printGameBoard(gameBoard);
        //Kontrollib võitjaid
        String result = checkWinner(playerPositions1, playerPositions2);
        System.out.println(result);
        if(result.length() != 0){
            
            running = false;
        } 
    }
    scan.close();
    System.exit(0);
}
}
