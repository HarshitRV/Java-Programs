package src.college;
import java.io.*;

public class RevNum {
    public static void main(String[] args) {
        int n, remainder, revno = 0;

        Console c = System.console();
        n = Integer.parseInt(c.readLine("Enter a two or more digit number: "));
        
        int original_number = n;
        // Finding the revno using while loop
        while(n!=0){
            remainder = n%10;
            revno = (revno * 10) + remainder;
            n /= 10;
        }
        System.out.println("Revno using while loop: "+revno);
    
        // Finding the revno using for loop
        n = original_number;
        revno = 0;
        for (int i = n; i!= 0; i/=10){
            remainder = n%10;
            revno = (revno*10) + remainder;
            n /= 10;
        }
        System.out.println("Revno using for loop: "+revno);

        // Findind the revno using do while loop
        n = original_number;
        revno = 0;
        do {
            remainder = n%10;
            revno = (revno*10) + remainder;
            n /= 10;
        }while(n!=0);
        System.out.println("Revno using do while loop: "+revno);
    }
}
