package src.challenges.HarshitRV;

import java.util.*;
import java.io.*;

public class VectorEx {
    public static void main(String[] args) {
        Vector<Integer> arr = new Vector<Integer>(); // ONLY NON PRIMITIVE
        // int[] arr =  new int[5];
        Integer[] arr2 = new Integer[5]; // NON PRIMITIVE
        int[] arr3 = new int[5]; // PRIMITIVE

        // Insert 10 number into the array.
        System.out.println("Inserting 10 numbers into the array.");
        for(int i=1; i<=10; i++) arr.add(i);

        System.out.println("Here are all the numbers.");
        System.out.println(arr.toString());

        System.out.println("Inserting extra 5");
        for(int i=11; i<=15; i++) arr.add(i);
        System.out.println(arr.toString());
        
        System.out.println("Capacity: "+arr.capacity());

        Console c = System.console();
        int index = Integer.parseInt(c.readLine("Enter the index you want to fetch: "));
        System.out.println("Number at index "+index+" = "+arr.get(index));

        int el = Integer.parseInt(c.readLine("Insert a element: "));
        arr.insertElementAt(el, arr.capacity());

        System.out.println("All array items after adding new one");
        for(int i=0; i<arr.capacity(); i++)
            System.out.println(arr.get(i));
    }
}
