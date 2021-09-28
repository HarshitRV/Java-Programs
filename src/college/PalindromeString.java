package src.college;
import java.io.*;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "";

        Console c = System.console();

        String input = c.readLine("Enter a word to check: ");

        for(int i=input.length()-1; i>=0; i--){
            str += input.charAt(i);
        }

        if(input.equals(str))
            System.out.println("It is a Palindrome");
        else {
            System.out.println(input+" when reversed is "+str);
            System.out.println("So "+input+" is not palindrome.");
        }
    }
    
}
