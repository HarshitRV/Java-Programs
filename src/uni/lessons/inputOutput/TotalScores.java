package src.uni.lessons.inputOutput;

import java.io.*;
import java.util.*;

public class TotalScores {
    public static void main(String[] args) {
        String scoreFile = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/SCORES.TXT";
        try {
            File file = new File(scoreFile);
            Scanner sc = new Scanner(file);
            sc.useDelimiter("\\D+");
            int total = 0;
            while (sc.hasNext()) {
                total += sc.nextInt();
            }
            System.out.println(total);
            sc.close();
        } catch (NullPointerException ne) {
            System.out.println("Need file path");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }
    }
}
