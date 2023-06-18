package src.uni.lessons.inputOutput;

import java.io.*;
import java.util.ArrayList;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/STORY.TXT");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));

        System.out.println("Enter your text");
        System.out.println("Enter 'stop' to exit");

        ArrayList<String> editor = new ArrayList<>();

        while (true) {
            String text = br.readLine();
            editor.add(text);
            if (text.equals("stop"))
                break;
            else
                bw.write(text);
        }

        for (String text : editor) {
            if (text.equals("stop"))
                break;
            System.out.println(text);
        }
        br.close();
        bw.close();
    }
}
