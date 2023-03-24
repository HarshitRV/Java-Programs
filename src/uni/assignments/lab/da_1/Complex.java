package src.uni.assignments.lab.da_1;

import java.util.Scanner;

public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex() {
        realPart = 0.0;
        imaginaryPart = 0.0;
    }

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex add(Complex c) {
        double newRealPart = realPart + c.realPart;
        double newImaginaryPart = imaginaryPart + c.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public Complex subtract(Complex c) {
        double newRealPart = realPart - c.realPart;
        double newImaginaryPart = imaginaryPart - c.imaginaryPart;
        return new Complex(newRealPart, newImaginaryPart);
    }

    public void print() {
        System.out.printf("%f + (%f)i\n", realPart, imaginaryPart);
    }
}

class DriverComplex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter real and imaginary part for fist number: ");
        Complex c1 = new Complex(sc.nextDouble(), sc.nextDouble());

        System.out.print("Enter real and imaginary part for second number: ");
        Complex c2 = new Complex(sc.nextDouble(), sc.nextDouble());

        Complex sum = c1.add(c2);
        Complex diff = c1.subtract(c2);

        System.out.println("Complex numbers");
        c1.print();
        c2.print();

        System.out.print("\nTheir Sum: ");
        sum.print();

        System.out.println("\nTheir Difference: ");
        diff.print();

        sc.close();
    }
}
