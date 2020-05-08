package app;

public class Mixing{
    
    public static void main(String[] args) {
        
    
    
    final Ion ion1 = new Ion("H", 1.0, 1);
    final Ion ion2 = new Ion ("NO", 62.0, -1);

    int ion1Charge = ion1.getCharge();
    String ion1Name = ion1.getName();
    double ion1Mass = ion1.getMassSum();

    int ion2Charge = ion2.getCharge();
    String ion2Name = ion2.getName();
    double ion2Mass = ion2.getMassSum();
   
    if(ion1Charge + ion2Charge == 0){
        Ion ion3 = new Ion(ion1Name+ion2Name, ion1Mass+ion2Mass, 0);
        System.out.println(ion3.toString());
    }

    
    }
}

//https://howtodoinjava.com/java/collections/arraylist/arraylist-get-method-example/
//Varasem kodutöö