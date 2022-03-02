// Program to check, whether the input letter is vowel or consonant?
package src.challenges.HarshitRV;

import java.io.*;
import java.util.Scanner;

public class VowelsOrConsonents {
    public static void main(String[] args) {
        Console c = System.console();
        Scanner sc = new Scanner(System.in);

        // Char input using Console class.
        char ch1 = c.readLine("Enter the letter to check: ").charAt(0);

        // Char input using Scanner class.
        // char ch2 = sc.next().charAt(0);

        switch(ch1){
            case 'A': case 'a': 
            case 'E': case 'e':
            case 'I': case 'i':
            case 'O': case 'o': 
            case 'U': case 'u':
            System.out.println(ch1+" is vowel");
            break;
            default:
            System.out.println(ch1+" is consonant");
        }

        sc.close();
    }
}
