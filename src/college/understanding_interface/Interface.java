package src.college.understanding_interface;

import java.io.*;

interface InterfaceShape {
    void area(int n1, int n2);
}

class Square1 implements InterfaceShape {
    public void area(int n1, int n2) {
        System.out.println("Area of square is " + (n1 * n2));
    }

    public static void main(String[] args) {
        Console c = System.console();
        int n = Integer.parseInt(c.readLine("enter the number:"));

        Square1 s1 = new Square1();

        s1.area(n, n);

    }
}

class Rectangle1 implements InterfaceShape {
    public void area(int n1, int n2) {

        System.out.println("Area of reactangle is " + (n1 * n2));
    }

    public static void main(String[] args) {
        Console c = System.console();
        int n1 = Integer.parseInt(c.readLine("enter the length:"));
        int n2 = Integer.parseInt(c.readLine("enter the breath:"));
        Rectangle1 r1 = new Rectangle1();
        r1.area(n1, n2);
    }

}
