/*
    Code to demonstrate the use of throw keyword.
    - throw keyword is used to throw an exception forcefully/explicitly.
*/
package src.college.understanding_exceptions;

import java.io.*;
public class ThrowEx1 {
    int a,b;

    void accept() throws NumberFormatException {
        Console c = System.console();
        a = Integer.parseInt(c.readLine("Enter num1: "));
        b = Integer.parseInt(c.readLine("Enter num2: "));
    }

    void display() throws ArithmeticException{
        System.out.println("Sum is "+(a+b));
        System.out.println("Difference is "+(a-b));
        System.out.println("Product is "+(a*b));
        System.out.println("Division is "+(a/b));
    }

    public static void main(String[] args) {
        ThrowEx1 t = new ThrowEx1();
        try {
            t.accept();
            if (t.b == 0)
                throw new ArithmeticException("Division by zero");
            t.display();
        } catch (ArithmeticException e) {
            System.out.println("Exception occured "+e);
        } catch (NumberFormatException e) {
            System.out.println("Exception occured "+e);
        }
    }
}
