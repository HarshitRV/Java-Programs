package src.college;
import java.io.*;

public class Vowels {
    public static void main(String[] args) {
        int count = 0;
        Console c = System.console();

        String input = c.readLine("Enter a string: ");

        for(int i=0; i<input.length(); i++){
            switch(input.charAt(i)){
                case 'a', 'A', 'e', 'I', 'i', 'O', 'o', 'U', 'u':
                count ++;
            }
        }
        System.out.println("Vowels: "+count);
    }
}
