/*
    Program to demonstrate the exceptions in an array.
*/
package src.college.understanding_exceptions;

import java.io.*;

class ArrayException {
    public static void main(String[] args) {
        Console c = System.console();
        int arr[] = new int[5];
        try {

            for (int i = 0; i < 5; i++) {
                arr[i] = Integer.parseInt(c.readLine("Enter num at index " + i+" : "));
            }
            System.out.print("Array items are :-  ");
            for (int i = 0; i <= 5; i++) {   // exception will be raised when i = 5
                System.out.print(arr[i]+" ");// as there are only 5 elements not 6.
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArray index out of bounds");
        } catch (NumberFormatException e) {
            System.out.println("Not a number.");
        }
    }
}