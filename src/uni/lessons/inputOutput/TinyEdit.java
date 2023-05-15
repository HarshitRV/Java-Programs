package src.uni.lessons.inputOutput;

import java.io.*;
import java.util.ArrayList;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter your text");
        System.out.println("Enter 'stop' to exit");

        ArrayList<String> editor = new ArrayList<>();

        while (true) {
            String text = br.readLine();
            editor.add(text);
            if (text.equals("stop"))
                break;
        }

        for (String text : editor) {
            if (text.equals("stop"))
                break;
            System.out.println(text);
        }
    }
}
