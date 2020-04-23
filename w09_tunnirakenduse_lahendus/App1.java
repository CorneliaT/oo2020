package app;

public class App1 {
    public static void main(String[] args) throws Exception {
        MyThread1 myThread1 = new MyThread1("Even thread", 1000);
        MyThread1 myThread2 = new MyThread1("Odd thread", 600);
        myThread1.start();
        myThread2.start();
    }
}