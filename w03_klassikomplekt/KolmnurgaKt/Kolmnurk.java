package KolmnurgaKt;

public class Kolmnurk {
    private int a;
    private int b;
    private int c;
    private Colour colour;

    

    public Kolmnurk(int a, int b, int c, Colour colour) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.colour = colour;
       
    }

    public int getA() {
        return a;
        }
    public int getB() {
        return b;
        }
    public int getC() {
        return c;
        }

    public Colour getColourType() {
            return colour;
        }

    public String getColour() {
        String ret;
        switch (colour){
            case SININE:
                ret= "Sinine";
                break;
            case PUNANE:       
                ret= "Punane";
                break;
            case ROHELINE:
                ret= "Roheline";
                break;
            default :
                ret= "N/A";
                break;
    
            }   
            return ret;
        }

    public String getLiik(){
        if(a == b & b == c & c == a ){
            return "võrdkülgne kolmnurk";
        }
        else if (a == b || b == c || c == a){
            return "võrdhaarne kolmnurk";
        }
        
        else{
            return "mingi imelik kolmnurk";
        }
    }
    public int getLen(){
        return a+b+c;
    }
    
    public String getInfo() {
        return "A: " + a + "; B: " + b + "; C: " + c + "; Colour: "+ getColour() + "; Length: " + getLen()+ "; Type: " + getLiik();
    }

    
        
            
        }