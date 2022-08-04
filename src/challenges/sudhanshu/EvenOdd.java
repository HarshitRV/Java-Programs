package src.challenges.sudhanshu;
import java.io.*;



public class EvenOdd {
    public static void main(String args[]){
        // System.out.println("hello");
        Console c = System.console();
        int a = Integer.parseInt(c.readLine("Enter a no."));
        // int  b = Integer.parseInt(c.readLine("Enter a no."))
        if((a%2) == 0){
        System.out.println("is even");
        
        }else{
        System.out.println("Odd");

        }


        
        }
    }
