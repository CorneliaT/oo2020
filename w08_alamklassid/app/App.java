package app;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        Trick trick1 = new Superman("Sidesuperman", 2, "Superman", 3 );
        Trick trick2 = new Aeysha("Split", 3, "Aeysha", 7);
        Trick trick3 = new Superman("Titanic", 3, "Shouldermount" , 6);

     

        List<Trick> tricks = new ArrayList<>();
        tricks.add(trick1);
        tricks.add(trick2);
        tricks.add(trick3);

        

        for(Trick trick : tricks) {
            trick.getPremise();
            trick.getTimeToMaster();
            System.out.println("-----------------------");
        }
    }
}