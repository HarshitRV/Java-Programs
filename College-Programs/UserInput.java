import java.io.*;
public class UserInput {
    public static void main(String[] args) {
        Console c = System.console();
        String name = c.readLine("Enter your name: ");
        System.out.println(name);
    }
}
