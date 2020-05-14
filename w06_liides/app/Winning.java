import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Winning {

    private static List<List<Integer>> winning = new ArrayList<>();
    static{
        List<Integer> topRow = Arrays.asList(1,2,3);
        List<Integer> midRow = Arrays.asList(4,5,6);
        List<Integer> botRow = Arrays.asList(7,8,9);
        List<Integer> leftCol = Arrays.asList(1,4,7);
        List<Integer> midCol = Arrays.asList(2,5,8);
        List<Integer> rigCol = Arrays.asList(3,6,9);
        List<Integer> cross1 = Arrays.asList(1,5,9);
        List<Integer> cross2 = Arrays.asList(7,5,3);

        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rigCol);
        winning.add(cross1);
        winning.add(cross2);
    }

    //Mängu lõpetamine
    for(List<Integer> l: winning){
        if(playerPositions1.containsAll(l)){
            return "Congrats Player 1!";
        }else if(playerPositions2.containsAll(l)){
            return "Congrats Player 2!";
        }
    }
    if(playerPositions1.size() + playerPositions2.size() == 9){
        return "Neither of you won suckers."; 
    }
    return"";
}
}