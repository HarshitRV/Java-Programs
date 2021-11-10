/*
    Program #2 to demonstrate the
    multiple exceptions in java.

    Note: There can be multiple catch to single try.
*/

package src.college.understanding_exceptions;

import java.io.*;

public class ExceptionEx2 {
    public static void main(String[] args) {
        try {
            Console c = System.console();


            int a = Integer.parseInt(c.readLine("Enter num a = ")); // can throw NumberFormatException 
            int b = Integer.parseInt(c.readLine("Enter num b = ")); // can throw NumberFormatException 

            System.out.println("Sum = " + (a + b));
            System.out.println("Diff = " + (a - b));
            System.out.println("Product = " + (a * b));
            System.out.println("Division = " + (a / b)); // can throw ArithmeticException

        } catch (NumberFormatException e) {
            System.out.println("Not a number.");
        } catch (ArithmeticException e) {
            System.out.println("b cannot be zero.");
        }
    }
}
