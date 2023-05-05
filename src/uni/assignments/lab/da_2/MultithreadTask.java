package src.uni.assignments.lab.da_2;

import java.util.Random;;

public class MultithreadTask {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrintHelloWorld());
        Thread t2 = new Thread(new PrintRandomNumber());

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}

class PrintHelloWorld implements Runnable {
    public void run() {
        for (int i = 0; i < 100; i++)
            System.out.println("Hello World!");
        System.out.println("Finished printing Hello World!");
    }
}

class PrintRandomNumber implements Runnable {
    public void run() {
        Random r = new Random();

        for (int i = 0; i < 100; i++)
            System.out.println(r.nextInt(110, 251));
        System.out.println("Finished printing random numbers!");
    }
}