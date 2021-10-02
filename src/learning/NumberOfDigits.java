package src.learning;
import java.io.*;

public class NumberOfDigits {
    public static void main(String[] args) {
        Console c = System.console();
        long n = Long.parseLong(c.readLine("Enter a number: "));
        int s = Integer.parseInt(c.readLine("Enter the search num to find the frequency: "));
        int count = 0;

        long original_num = n;
        while(n>0){
            long remainder = n%10;
            if (remainder == s)
                count++;
            n = n/10;
        }
        System.out.print(s+" appeared "+count+" times in number "+original_num);
    }
}
