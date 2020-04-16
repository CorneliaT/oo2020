package app;

public class Superman extends Trick {

    public Superman(String name, int level,  String premise, int timeToMaster){
        this.name = name;
        this.level = level;
        this.timeToMaster = timeToMaster;
    }

    @Override
    public void getPremise() {
        System.out.println("It's not hard, just painful");
    }
}