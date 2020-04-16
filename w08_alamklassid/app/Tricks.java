package app;
public abstract class Tricks{
    String name;
    int level;

    public abstract void action();

    public void sleep(){
        System.out.println("I don't feel like it.");
    } 
}