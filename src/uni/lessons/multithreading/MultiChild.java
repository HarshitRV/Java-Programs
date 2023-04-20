package src.uni.lessons.multithreading;

public class MultiChild {
    public static void main(String[] args) {
        NewThread nt1 = new NewThread("Thread 1");
        NewThread nt2 = new NewThread("Thread 2");
        NewThread nt3 = new NewThread("Thread 3");

        nt1.start();
        nt2.start();
        nt3.start();
    }
}
