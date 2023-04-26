package src.uni.lab.cat_1.set_a;

import java.util.Random;
import java.util.Scanner;

public class Lines {
    private String[] arrLine;

    Lines() {
        arrLine = new String[1 + new Random().nextInt(5)];
    }

    public void setArrLines() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + arrLine.length + "lines of text");

        for (int i = 0; i < arrLine.length; i++) {
            arrLine[i] = sc.nextLine().replace("\\.", "");
        }

        sc.close();
    }

    public void countPrepostions(){
        
    }
}
