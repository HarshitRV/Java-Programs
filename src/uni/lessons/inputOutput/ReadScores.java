package src.uni.lessons.inputOutput;

import java.io.*;
import java.util.*;

public class ReadScores {
    public static void main(String[] args) {
        try {
            String filePath = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/READSCORES.TXT";
            File scores = new File(filePath);
            Scanner sc = new Scanner(scores);
            // sc.useDelimiter("\\D+");
            // while (sc.hasNextDouble()) {
            //     System.out.println(sc.nextDouble());
            // }
            // sc.close();
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            String[] scoreArr = null;
            int total = 0;
            int count = 0;
            while ((line = br.readLine()) != null) {
                scoreArr = line.trim().split("\\s+");
                count += scoreArr.length;
                if (scoreArr.length > 0) {
                    for (int i = 0; i < scoreArr.length; i++) {
                        // System.out.println(scoreArr[i]);
                        total += Double.parseDouble(scoreArr[i]);
                    }
                }
            }
            System.out.println(total);
            System.out.println(total / count);
            br.close();
            sc.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
