package src.challenges.HarshitRV;

import java.io.Console;
import java.util.*;
public class SortLetters {
    public static void main(String[] args) {
        Console c = System.console();
        char[] charArr = c.readLine("Enter letter").toCharArray();
        Arrays.sort(charArr);

        System.out.println(charArr);
    }
}