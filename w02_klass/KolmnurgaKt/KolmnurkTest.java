package KolmnurgaKt;

public class KolmnurkTest {
    public static void main(String[] args) {
        Kolmnurk kolmnurk1= new Kolmnurk();
        
        Kolmnurk  kolmnurk = new Kolmnurk(4,5,6);
        
    
            
        
    
        Kolmnurk[] kolmnurgad = {kolmnurk, kolmnurk1};
        for(int i=0; i< kolmnurgad.length; i++){
        System.out.println("A = "+kolmnurgad[i].getA());
        System.out.println("B = "+kolmnurgad[i].getB());
        System.out.println("C = "+kolmnurgad[i].getC());
        System.out.println("See on "+kolmnurgad[i].getLiik());
        System.out.println("Ümbermõõt on "+kolmnurgad[i].getLen());
        

        
        
    
        }
    }
    }