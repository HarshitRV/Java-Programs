/*
    Program to demonstrate the use of custom exception.

    Note: Custom exception in this program is a subclass of RuntimeException class.
          Runtime exception are not necessry to be handled. So we can write the code
          without handling the exception.
*/
package src.college.understanding_exceptions;

import java.io.*;

class CustomExceptionEx2 extends RuntimeException {
    CustomExceptionEx2(String message) {
        super(message);
    }
}

class UseCustomExceptionEx2 {
    public static void main(String[] args) {
        Console c = System.console();

        String str1 = c.readLine("Enter str1: ");
        String str2 = c.readLine("Enter str2: ");

        if (str1.equals(str2))
            throw new CustomExceptionEx2("str1 and str2 cannot be equal");

        System.out.println(str1 + " " + str2);

    }
}