package app;

public class MyThread1 implements Runnable {

    private Thread thread;
    private String tName;

   
    public MyThread1(String tName, int inter) {
        this.tName = tName;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {

                if (tName == "Odd thread")
                { 
                    if (i % 2 == 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(tName + ": " + i);
                        Thread.sleep(1000);
                    } 
                } else if(tName == "Even thread"){
                    if (i % 2 != 0){
                        System.out.println("");
                    }
                    else{
                        System.out.println(tName + ": " + i);
                        Thread.sleep(1000);
                    } 
                }else{
                    System.out.println("");
                }

            }
        } catch (InterruptedException e) {
            System.out.println("Thread " + tName + " dead");
        }

    }

    public void start() {
        System.out.println("Thread " + tName + " starting");
        if (thread == null) {
            thread = new Thread(this, tName);
            thread.start();
        }
    }

}