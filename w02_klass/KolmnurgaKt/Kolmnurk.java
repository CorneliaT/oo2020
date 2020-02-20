package KolmnurgaKt;

public class Kolmnurk {
    public int a;
    public int b;
    public int c;
    public int length;
    

    public Kolmnurk(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
       
    }
    public  Kolmnurk() {
        a=1;
        b= 1;
        c= 1;
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
    

    
        
            
        }
