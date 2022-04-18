package src.challenges.HarshitRV;

import java.io.Console;
import java.util.*;
public class SortLetters {
    public static void main(String ...args) {
        Console c = System.console();
        char[] charArr = c.readLine("Enter letter").toCharArray();
        Arrays.sort(charArr);

        System.out.println(new String(charArr));
        int[][] arr = {{1232,432,334},{1, 2, 3, 4, 5}};
        for(int[] i: arr){
            for(int j: i){
                System.out.println(j);
            }
        }
    }
}