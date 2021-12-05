package src.lessons;

import java.io.*;
import java.util.Scanner;

class TryCatch {
    static double div(int a, int b) {
        try {
            return a / b; // Arithmatic exception
        } catch (ArithmeticException e) {
            System.out.println("b cannot be 0");
            return -1;
        }
    }

    public static void main(String[] args) {

        try {
            Console c = System.console();
            int num1 = Integer.parseInt(c.readLine("Enter num1: ")); // NumberFormatException
            int num2 = Integer.parseInt(c.readLine("Enter num2: ")); // NumberFormatException

            double DivOf = div(num1, num2);

            System.out.println("Division = " + DivOf);
        } catch (NumberFormatException e) {
            System.out.println("Not a number");
        }
    }
}

class TryCatch2 {
    static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        try {
            num1 = in.nextInt();
            num2 = in.nextInt();

            int SumOf = sum(num1, num2);
            System.out.println("Sum = " + SumOf);

            in.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("Not a number");
        }

    }
}
