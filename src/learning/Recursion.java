/*
    Recurion

    A simple program to demonstrate recursion.
    Here we find the factorial of a number using
    resursive function.
*/

package src.learning;

import java.util.*;

class Factorial {

    // recursive function
    int fact(int n){
        if (n == 1)return 1;
        int result = fact(n-1) * n;
        return result;
    }
}

class CreateArray {
    int arr[];
    
    CreateArray(int s){
        arr = new int[s];
    }

    void displayArr(int i){
        if (i == 0){
            return;
        }else{
            displayArr(i-1);
        } 
        System.out.println("["+(i-1)+"]: "+(arr[i-1]));
    }
}

class Recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number to find the factorial: ");
        int num = in.nextInt();
        Factorial f1 = new Factorial();
        // calling the recursive function fact.
        int ans = f1.fact(num);
        System.out.println("Factorial of "+num+" is: "+ans);

        System.out.print("Enter size of arr: ");
        int size = in.nextInt();
        CreateArray a1 = new CreateArray(10);
        for (int i=0; i<size; i++)
            a1.arr[i] = i;
        a1.displayArr(size);

        in.close();
    }
}


