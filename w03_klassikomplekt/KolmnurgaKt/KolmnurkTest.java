package KolmnurgaKt;

public class KolmnurkTest {
    public static void main(String[] args) {
        
    
        Kolmnurgad kogum = new Kolmnurgad();

        Kolmnurk kolmnurk1 = new Kolmnurk(2,6,4,Colour.ROHELINE);
        Kolmnurk kolmnurk2 = new Kolmnurk(4,5,6,Colour.SININE);
        Kolmnurk kolmnurk3 = new Kolmnurk(6,2,9,Colour.PUNANE);

        kogum.addKolmnurk(kolmnurk1);
        kogum.addKolmnurk(kolmnurk2);
        kogum.addKolmnurk(kolmnurk3);
        kogum.list();

        System.out.println();
        System.out.println( kogum.listCertainColour(Colour.SININE) +" "+ kogum.listByLen(12));
        System.out.println();
        System.out.println(kogum.getSpecific(2).getInfo());
        


      
        

        
        
    
        }
    }
    