package src.uni.lessons.inputOutput;

import java.io.*;
import java.util.*;

public class WriteIntegers {
    public static void main(String[] args) {
        String path = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/WRITESCORES.TXT";

        try {
            File writeScore = new File(path);
            BufferedWriter bw = new BufferedWriter(new FileWriter(writeScore, true));

            for (int i = 0; i < 100; i++) {
                int num = new Random().nextInt(1, 101);
                bw.write(num + " ");
            }

            bw.close();

            Scanner sc = new Scanner(writeScore);
            sc.useDelimiter("\\D+");
            ArrayList<Integer> arr = new ArrayList<>();
            while (sc.hasNextInt()) {
                arr.add(sc.nextInt());
            }
            Collections.sort(arr);
            System.out.println(arr);
        } catch (NullPointerException ne) {
            ne.printStackTrace();
        } catch (IOException ie) {
            ie.printStackTrace();
        }
    }
}
