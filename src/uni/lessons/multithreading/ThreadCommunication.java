package src.uni.lessons.multithreading;

public class ThreadCommunication {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        new Producer(n);
        new Consumer(n);
    }
}

class Numbers {
    int num;
    boolean valueSet;

    Numbers() {
        valueSet = false;
    }

    synchronized void setNum(int num) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        System.out.println("Set num: " + num);

        this.num = num;
        valueSet = true;
        notify();
    }

    synchronized void getNum() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Get num: " + num);
        valueSet = false;
        notify();
    }
}

class Producer implements Runnable {
    Numbers n;

    Producer(Numbers n) {
        this.n = n;
        Thread t = new Thread(this, "Producer");
        t.start();
    }

    public void run() {
        int i = 0;
        while (true) {
            n.setNum(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}

class Consumer implements Runnable {
    Numbers n;

    Consumer(Numbers n) {
        this.n = n;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }

    public void run() {
        while (true) {
            n.getNum();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

            }
        }
    }
}
