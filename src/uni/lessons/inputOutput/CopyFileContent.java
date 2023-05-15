package src.uni.lessons.inputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileContent {
    public static void main(String[] args) throws IOException {
        String originalFilePath = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/sample/FILE.TXT";
        String copyFilePath = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/sample/COPY.TXT";
        try {
            int i;

            FileInputStream fin = new FileInputStream(originalFilePath);
            FileOutputStream fout = new FileOutputStream(copyFilePath);

            do {
                i = fin.read();
                if (i != -1) {
                    fout.write(i);
                }
            } while (i != -1);

            fin.close();
            fout.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
