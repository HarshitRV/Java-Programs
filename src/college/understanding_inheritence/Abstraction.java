package src.college.understanding_inheritence;
import java.io.*;

abstract class Shape {
    abstract void area(int a, int b);
}

class Square extends Shape{
    void area(int a, int b){
        System.out.println("Area of square: "+(a*b));
    }
    public static void main(String[] args) {
        Console c = System.console();
        int side = Integer.parseInt(c.readLine("Enter length of a side: "));

        Square s1 = new Square();
        s1.area(side, side);
    }
}

class Rectangle extends Shape {
    void area(int l, int b){
        System.out.println("Area of rectangle: "+(l*b));
    }
    public static void main(String[] args) {
        Console c = System.console();
        int len = Integer.parseInt(c.readLine("Enter length: "));
        int width = Integer.parseInt(c.readLine("Enter width: "));

        Rectangle r1 = new Rectangle();
        r1.area(len, width);
    }
}