package app;

public abstract class Trick extends Tricks {
    String premise;
    int timeToMaster;

    public void getPremise() {
        System.out.println("Eelduseks on " + premise );
    }

    public void getTimeToMaster() {
        System.out.println("Aega selle õppimiseks läheb" + timeToMaster + " tundi");
    }

    @Override
    public void action() {
        System.out.println("Teed ära!");
    }

    @Override
    public void sleep() {
        System.out.println("Täna ei tee ära.");
    }
}