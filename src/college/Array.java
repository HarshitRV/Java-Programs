package src.college;

import java.io.*;

public class Array {
    public static void main(String[] args) {
        int arr[] = new int[5];

        Console c = System.console();

        for (int i = 0; i < 5; i++) {
            arr[i] = Integer.parseInt(c.readLine("Enter num " + (i + 1) + ":"));
        }

        System.out.println("Entered numbers are");

        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + ",");
        }
    }
}
