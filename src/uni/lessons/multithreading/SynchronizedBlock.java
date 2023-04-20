package src.uni.lessons.multithreading;

class CallMe {
    void callMe(String msg) {
        System.out.print("[");
        try {
            System.out.print(msg);
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Call me thread interupped");
        }
        System.out.println("]");
    }
}

class Caller implements Runnable {
    Thread t;
    CallMe c;
    String message;

    Caller(CallMe c, String message) {
        t = new Thread(this);
        this.c = c;
        this.message = message;
    }

    public void run() {
        synchronized (c) {
            c.callMe(message);
        }
    }

    public static void main(String[] args) {
        CallMe c = new CallMe();
        Caller caller1 = new Caller(c, "Hello");
        Caller caller2 = new Caller(c, "World");
        Caller caller3 = new Caller(c, "Java");

        caller1.t.start();
        caller2.t.start();
        caller3.t.start();

        try {
            caller1.t.join();
            caller2.t.join();
            caller3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}
