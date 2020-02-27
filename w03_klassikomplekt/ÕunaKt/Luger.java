import java.io.File;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class Luger{

    //http://www2.lawrence.edu/fast/GREGGJ/CMSC150/031Files.html Faili lugemine
    //https://stackoverflow.com/questions/303913/java-reading-integers-from-a-file-into-an-array Array tegemine

public static void main(String[] args) {
    Scanner input = null;
    try {
        input = new Scanner(new File("jagasis.txt"));
    } catch (Exception ex) {
        System.out.println("Can not open file.");
        System.exit(0);
    }
    
    int korvideArv = input.nextInt();
    int[] arr;

    while(input.hasNextInt()) {
        int a = input.nextInt();
        for(int  i = 1; i <arr.length; i++){
            a = arr[i];
        
     
    }

    Scanner scanner = new Scanner(new File("jagasis.txt"));
    int [] array;
    int i = 1;
    while(scanner.hasNextInt()){
    array[i++] = scanner.nextInt();
    
    for (int i = 1; i < array.length; i++) {
        esimene += array[i];
        teine += array[length-i];
        if (esimene % teine = 0){
            return i;
        }
    }
System.out.println("Korve on " + korvideArv + array);
}

}}}
           