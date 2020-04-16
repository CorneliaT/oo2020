package app;

public class Aeysha extends Trick {

    public Aeysha(String name, int level,  String premise, int timeToMaster){
        this.name = name;
        this.level = level;
        this.premise = "Crucifix";
        this.timeToMaster = timeToMaster;
    }

    public void safety() {
        System.out.println("You will need a spotter.");
    }
}