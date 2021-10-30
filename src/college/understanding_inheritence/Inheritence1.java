package src.college.understanding_inheritence;
import java.io.*;

class A {
    void sum(int a, int b) {
        System.out.println("Sum: "+(a+b));
    }
}

class B extends A{
    public static void main(String[] args) {
        Console c = System.console();
        int a = Integer.parseInt(c.readLine("Enter num1: "));
        int b = Integer.parseInt(c.readLine("Enter num2: "));

        B b1 = new B();
        b1.sum(a, b);

        sub(a, b);
    }

    static void sub(int a, int b){
        System.out.println("Difference: "+(a-b));
    }
}