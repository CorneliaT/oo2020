import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
 
public class KT3 {
    public static void main(String args[]) throws IOException {
        int[] annualIntRt = new int[howMany()];
        fillArray(annualIntRt);
        int speed = (average(annualIntRt,howMany()));
        PrintWriter writer = new PrintWriter("Kiirus.txt", "UTF-8");
        writer.println(speed);
        writer.close();

        //Main funktsioonis teen massiivi, täidan selle, arvutan keskmine kiiruse ning kirjutan faili (Writeri inspiratsioon: https://stackoverflow.com/questions/2885173/how-do-i-create-a-file-and-write-to-it-in-java)

    }
 
    private static void fillArray(int[] ary) {
        try {
            File arrayInput = new File("Kiirused.txt");
            Scanner in = new Scanner(arrayInput);
            int i = 0;  
            while (in.hasNextLine())
                ary[i++] = in.nextInt();
            in.close();
        }
        catch (FileNotFoundException e) {
            System.exit(1);
        }
        //See funktsioon paneb failist kiirused arraysse (Inspiratsioon: https://bytes.com/topic/java/answers/909500-how-fill-double-array-double-values-i-read-file)
    }

    public static int howMany() throws IOException  {
        BufferedReader reader = new BufferedReader(new FileReader("Kiirused.txt"));
        String line;
        
        line = reader.readLine();
        String[] inputLine = line.split(" ");
        int n = inputLine.length;
        reader.close();
        return n;

        //See funktsioon loeb kokku Kui palju arve on failis ja tagastab selle.
    }

    static int average(int a[], int n) { 
        int kokku = 0;
        for (int i = 0; i < n; i++) {
            kokku+=a[i];

        }
        return (kokku/n);
        //See funktsioon arvutab massiivi keskmise kiiruse.


    }

}


