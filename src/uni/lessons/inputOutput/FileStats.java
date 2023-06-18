package src.uni.lessons.inputOutput;

import java.io.*;

public class FileStats {
    public static void main(String[] args) {
        String filePath = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/sample/STORY.TXT";

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));

            String line;
            int lineCount = 0;
            int charCount = 0;
            int wordCount = 0;

            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();

                String[] words = line.trim().split(" ");
                wordCount += words.length;
            }

            System.out.println("Stats");
            System.out.println("Line Count " + lineCount);
            System.out.println("Word Count " + wordCount);
            System.out.println("Char Count " + charCount);
        } catch (IOException e) {
            System.out.println("cannot read file");
        }
    }
}
