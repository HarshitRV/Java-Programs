package src.uni.lessons.multithreading;

import java.util.*;

class HelloWorld implements Runnable {
    public Thread t;

    HelloWorld() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}

class PrintSubstring implements Runnable {
    private String str;

    public Thread t;

    PrintSubstring(String str, int start, int end) throws IndexOutOfBoundsException {
        this.str = str.substring(start, end);
        t = new Thread(this);
        t.start();
    }

    public String getStr() {
        return str;
    }

    @Override
    public void run() {
        System.out.println(getStr());
    }
}

class SumOneHundred implements Runnable {
    public Thread t;

    SumOneHundred() {
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        Random r = new Random();
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += r.nextInt(0, 10);
        }
        System.out.println(sum);
    }
}

class TestMultipleThreads {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            try {
                HelloWorld h = new HelloWorld();
                h.t.join();

                System.out.print("Enter the string, start and end index: ");
                PrintSubstring sub = new PrintSubstring(sc.next(), sc.nextInt(), sc.nextInt());
                sub.t.join();

                SumOneHundred sum = new SumOneHundred();
                sum.t.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}