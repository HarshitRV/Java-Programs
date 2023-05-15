package src.uni.lessons.inputOutput;

import java.io.*;

public class ReadFileContent {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        try {
            fin = new FileInputStream("/Users/harshitkrvishwakarma/Desktop/Java-Programs/sample/FILE.TXT");

            do {
                i = fin.read();
                if (i != -1)
                    System.out.print((char) i);
            } while (i != -1);
            fin.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
