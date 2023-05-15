package src.uni.lessons.multithreading;

import java.util.Arrays;
import java.util.Random;

public class ProduceNumsGetSum {
    int[] arr;
    boolean valueSet;
    Random r;

    ProduceNumsGetSum() {
        valueSet = false;
        arr = new int[10];
        r = new Random();
    }

    synchronized void generateNums() {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("interruped generation");
            }
        }

        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(0, 101);
            arr[i] = num;
        }

        System.out.print("Generated Array: ");
        System.out.print(Arrays.toString(arr));

        valueSet = true;
        notify();
    }

    synchronized void getSum() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("get sum interrupted");
            }
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable{
    ProduceNumsGetSum p;

    Producer(ProduceNumsGetSum p) {
        this.p = p;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            p.generateNums();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Producer interrupted");
            }
        }
    }
}

class Consumer implements Runnable{
    ProduceNumsGetSum p;

    Consumer(ProduceNumsGetSum p) {
        this.p = p;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            p.getSum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Consumer interrupted");
            }
        }
    }
}

class TestProduceNumsGetSum {
    public static void main(String[] args) {
        ProduceNumsGetSum p = new ProduceNumsGetSum();
        new Producer(p);
        new Consumer(p);
    }
}