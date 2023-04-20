package src.uni.lessons.multithreading;

public class NewThread extends Thread {
    public NewThread(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println(this.getName() + " interrupted");
        }
        System.out.println(this.getName() + " finished executing...");
    }
}

class NewThreadMain {
    public static void main(String[] args) {
        NewThread nt = new NewThread("New Thread");
        nt.start();

        try {
            for (int i = 5; i >= 0; i--) {
                System.out.println(i);

                // Notice this is greater than in run method
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("main thread ended...");
    }
}