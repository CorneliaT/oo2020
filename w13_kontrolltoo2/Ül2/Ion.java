package app;

public class Ion implements Element{
    
    private String name;
    private double massSum;
    private int charge;

    public Ion(String name, double massSum, int charge) {

            this.name = name;
            this.massSum = massSum;
            this.charge = charge;
        }

    @Override
    public String getName() {
        return name;
    }
    @Override
    public double getMassSum() {
        return massSum;
    }
    @Override
    public int getCharge(){
        return charge;
    }

	



	
       
}