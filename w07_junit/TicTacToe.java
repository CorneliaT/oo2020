import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {

    static ArrayList<Integer> playerPositions1 = new ArrayList<Integer>();
    static ArrayList<Integer> playerPositions2 = new ArrayList<Integer>();

public static void main(String[] args) {

    //Loon mängulaua
    char [] [] gameBoard = {
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '},
        {'-','+','-','+','-'},
        {' ','|',' ','|',' '}};

    
    printGameBoard(gameBoard);
   int i = 0;
        //While loop, mis kestab kogu mängu vältel. Küsib positsiooni ja kontrollib ega samal kohal juba midagi ei ole.
    while(true){
        Scanner scan = new Scanner(System.in);
        System.out.println("Positsioon 1-9");
        int playerPos = scan.nextInt();

        while(playerPositions1.contains(playerPos) || playerPositions2.contains(playerPos)){
            System.out.println("Position taken! Enter another one");
            playerPos = scan.nextInt();
        }
        i +=1;

        //Jagab mängukorrad player 1 ja 2 vahel.
        if( i % 2 == 0 ){
            placePiece(gameBoard, playerPos, "player2");

        }else{
            placePiece(gameBoard, playerPos, "player1");
        }
    

        printGameBoard(gameBoard);
        //Kontrollib võitjaid
        String result = checkWinner();
        System.out.println(result);
        //Väljub mängust
        if(result.length() != 0){
            System.exit(0);
        } 
        }
    
    }

    //Prindib mängulaua reahaaval välja
    public static void printGameBoard(char [] [] gameBoard){
        for(char[] row: gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char [] [] gameBoard, int pos, String user){

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
    //Kontrollib võitu
    public static String checkWinner(){

        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);
        List leftCol= Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rigCol = Arrays.asList(3,6,9);
        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(7,5,3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rigCol);
        winning.add(cross1);
        winning.add(cross2);

        //Mängu lõpetamine
        for(List l: winning){
            if(playerPositions1.containsAll(l)){
                return "Congrats Player 1!";
            }else if(playerPositions2.containsAll(l)){
                return "Conrgats Player 2!";
            }else if(playerPositions1.size() + playerPositions2.size() == 9){
                return "Neither of you won suckers."; 
            }
        }
        return"";
    }
}
// Abi: https://www.youtube.com/watch?v=gQb3dE-y1S4
