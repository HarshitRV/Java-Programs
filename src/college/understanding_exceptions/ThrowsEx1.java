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
        n1 = Integer.parseInt(c.readLine("Enter num 1:"));
        n2 = Integer.parseInt(c.readLine("Enter num 2:"));
    }

    void display() throws ArithmeticException, NumberFormatException {
        System.out.println("The addition is " + (n1 + n2));
        System.out.println("The subtraction is " + (n1 - n2));
        System.out.println("The division is " + (n1 / n2));
        System.out.println("The multiplication is " + (n1 * n2));
    }

    public static void main(String[] args) {
        try {
            Cal o = new Cal();
            o.accept();
            o.display();
        } catch (ArithmeticException e) {
            System.out.println("Arthmetic Error");
        } catch (NumberFormatException e) {
            System.out.println("Numberformat Error");
        }
    }
}
