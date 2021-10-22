/*
    Sample code to demonstrate try catch in Java.
*/
package src.college.understanding_exceptions;

import java.io.*;
public class ExceptionEx1 {

    static int cube(int x) {
        return x*x*x;
    }
    public static void main(String[] args) {
        try {
            Console c = System.console();

            int num = Integer.parseInt(c.readLine("Enter a number: "));

            System.out.println("Cube of "+num+" = "+cube(num));

        }catch(NumberFormatException e){
            System.out.println("Not a number");
        }
    }
}
