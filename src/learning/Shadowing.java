package src.learning;

public class Shadowing {
    static int x = 10;
    public static void main(String[] args) {
        System.out.println(x);
        fun();

        int x = 20;  // x is shadowed at this line which basically means it has been overridden.
        System.out.println(x);
    }
    static void fun(){
        System.out.println(x);
    }
}
