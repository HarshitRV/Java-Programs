package com.learning;
public class Promote {
    public static void main(String[] args) {
        char c = 97;             //Unicode for 'a'
        int i = 50000;

        System.out.println(c*i); // still a valid operation even if c = 'a'
        System.out.println(c);
    }
}