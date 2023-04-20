package src.uni.lessons.multithreading;

public class MyThread implements Runnable{
    Thread t;

    public MyThread(String threadName){
        t = new Thread(this, threadName);
    }

    @Override
    public void run(){
        for (int i = 5; i >= 0; i-- ){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e){
                System.out.println("MyThread interrupted");
            }
        }
        System.out.println("exiting MyThread...");
    }
}

class MyTheadMain {
    public static void main(String[] args) {
        MyThread mt = new MyThread("My Thread");
        mt.t.start();
        try {
            for (int i = 5; i >= 0; i--){
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Exiting main thread...");
    }
}
