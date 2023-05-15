package src.uni.lessons.inputOutput;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            FileOutputStream fo = new FileOutputStream(
                    "/Users/harshitkrvishwakarma/Desktop/Java-Programs/sample/STORY.TXT");

            System.out.println("Enter your story");
            System.out.println("Enter '/' to stop and save");

            while (true) {
                int i = br.read();
                if ((char) i == '/')
                    break;
                fo.write(i);
            }

            System.out.println("file saved");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
