package src.uni.lessons.inputOutput;

import java.io.*;

public class FacultyDetails {
    public static void main(String[] args) {
        String filePath = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/EMPLOYEEDATA.TXT";
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            for (int i = 0; i < 100; i++) {
                writer.write("name, salary, position");
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("file not found");
        }
    }
}