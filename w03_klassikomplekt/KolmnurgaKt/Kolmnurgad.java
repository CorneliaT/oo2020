import java.util.ArrayList;
import java.util.List;

public class Kolmnurgad{

    private final List<Kolmnurk> kogum = new ArrayList<>();

    public void addKolmnurk(final Kolmnurk kolmnurk) {
        kogum.add(kolmnurk);
    }

    public void removeKolmnurk(final int index) {
        kogum.remove(index);
    }

    public Kolmnurk getSpesific(final int index) {
        return kogum.get(index);
    }

    public void list() {
        for (int i = 0; i < kogum.size(); i++) {
            System.out.println("Kolmnurk: " + (i + 1) + " " + kogum.get(i).getInfo());
        }
    }

    public void listByColour(final Colour colour) {
        for(int i = 0; i < kogum.size(); i++){
            if(kogum.get(i).getColourType() == colour) {
                System.out.println("Kolmnurk: " + (i+1) + " " + kogum.get(i).getInfo());}
            
        }

}
}