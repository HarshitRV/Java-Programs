package src.uni.lessons.inputOutput;

import java.io.*;

public class BraceStyle {
    public static void main(String[] args) {
        try {
            File file = new File(
                    "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/FileStats.java");
            File file2 = new File(
                    "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/FileStats2.java");

            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(file2, false));
            String line;
            boolean openBraceFound = false;
            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.startsWith("{")) {
                    bw.write("{");
                    openBraceFound = true;
                } else if (line.equals("{")) {
                    bw.write("{");
                    openBraceFound = true;
                } else if (line.equals("}")) {
                    bw.write("}");
                    openBraceFound = false;
                } else if (openBraceFound) {
                    bw.newLine();
                    bw.write("\t" + line);
                } else {
                    bw.write(line);
                }
                bw.newLine();
            }

            br.close();
            bw.close();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
