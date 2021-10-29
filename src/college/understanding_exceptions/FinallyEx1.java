/*
    Program to demonstrate the finally block.
    The finally block is always executed, even if an exception is thrown.
*/
package src.college.understanding_exceptions;

public class FinallyEx1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            System.out.println("Inside try block");
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Inside catch block");
            System.out.println("Exception: " + e);
        } finally {
            System.out.println("Inside finally block");
        }


        System.out.println("Outside try catch block");
    }
}
