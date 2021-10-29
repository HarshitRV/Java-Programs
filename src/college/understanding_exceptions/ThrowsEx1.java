/*
    Code to demonstrate the use of throws keyword.
    Throws keyword is used to indicate that a method can throw an exception.
       - Added by Kushagra Jaiswal (github.com/KUSHAGRA-JAISWAL)
*/
package src.college.understanding_exceptions;

import java.io.*;

class Cal {
    int n1, n2;

    void accept() throws ArithmeticException, NumberFormatException {
        Console c = System.console();
        n1 = Integer.parseInt(c.readLine("enter num 1:"));
        n2 = Integer.parseInt(c.readLine("enter num 2:"));
    }

    void display() throws ArithmeticException, NumberFormatException {
        System.out.println("the addition is " + (n1 + n2));
        System.out.println("the subbtraction is " + (n1 - n2));
        System.out.println("the division is " + (n1 / n2));
        System.out.println("the multiplication is " + (n1 * n2));
    }

    public static void main(String[] args) {
        try {
            Cal o = new Cal();
            o.accept();
            o.display();
        } catch (ArithmeticException e) {
            System.out.println("arthmetic error");
        } catch (NumberFormatException e) {
            System.out.println("numberformat error");
        }
    }
}
