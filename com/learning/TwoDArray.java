package com.learning;
import java.io.*;

public class TwoDArray {
    public static void main(String[] args) {
        int twoDarray[][] = new int[4][5];

        Console c = System.console();

        for (int i=0;i<4;i++){
            for(int j=0; j<5;j++){
                twoDarray[i][j] = Integer.parseInt(c.readLine("Enter num at "+"row "+(i+1)+" column "+(j+1)+":"));
            }
        }
        System.out.println("Entered array number are");

        for (int i=0;i<4;i++){
            for(int j=0; j<5;j++){
               System.out.print( twoDarray[i][j]);
            }
            System.out.println();
        }
    }
}
