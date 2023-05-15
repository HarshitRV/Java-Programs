package src.uni.lessons.inputOutput;

import java.io.*;

public class CreateDirectory {
    public static void main(String[] args) throws Exception {
        String directory = "/Users/harshitkrvishwakarma/Desktop/Java-Programs/src/uni/lessons/inputOutput/filePro/";

        File f = new File(directory);
        if (!f.exists()) {
            System.out.println("Creating the folder");
            f.mkdir();
        } else {
            System.out.println("Directory already exists");
        }

        String fileWithData = "FILEWITHDATA.TXT";
        String fileWithoutData = "FILEEMPTYDATA.TXT";

        String someFileData = "This is data for file with some data";

        FileOutputStream fo = new FileOutputStream(directory + fileWithData);
        RandomAccessFile emptyFile = new RandomAccessFile(directory + fileWithoutData, "rw");
        // emptyFile.writeChars(someFileData);

        for (int i = 0; i < someFileData.length(); i++) {
            fo.write(someFileData.charAt(i));
        }

        fo.close();
    }
}
