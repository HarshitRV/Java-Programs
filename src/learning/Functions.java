package src.learning;

public class Functions {
    public static void main(String[] args) {
        System.out.println(greet("Harshit"));
        System.out.println(sum(10,20));
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static String greet(String name){
        return "Hello "+name;
    }
}
