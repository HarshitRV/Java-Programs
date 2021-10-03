package src.learning;

public class IncrementDecrement {
    public static void main(String[] args) {
        int x,y;
        x = 45;
        y = ++x;  // Increment then assignment
        System.out.println("x = "+x+", y = "+y);

        y = x++; // Assignment then increment
        System.out.println("x = "+x+", y = "+y);
    }
}
