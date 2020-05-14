import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int time = 0;
        Game Game = new Game();
        int winner = 0;
        Game.start('X');

        while(winner == 0){
            System.out.println(Game.getPlayer() + " kord");
            boolean taken = true;
            Game.PrintBoard();
            System.out.println("Vali pozitsioon");
            while(taken){
                time = input.nextInt();
                taken = Game.checkPlacement(time);
            }
            Game.place(Game.getPlayer(), time);
            winner = Game.winner();
            Game.tie();

            Game.getTurn();
        }
    }
}