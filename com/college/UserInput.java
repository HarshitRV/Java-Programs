package com.college;
import java.io.*;

public class UserInput {
    public static void main(String[] args) {
        Console c = System.console();

        //taking input and displaying it on one line
        System.out.println(c.readLine("Enter your name: ")); 
        
    }
}
