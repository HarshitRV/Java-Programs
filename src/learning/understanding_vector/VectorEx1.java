package src.learning.understanding_vector;
import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector <Integer> in = new Vector<Integer>(5);
        for(int i=1; i<=20; i++){
            in.add(i);
        }
        System.out.println("Capacity of the vector = "+in.capacity());
        for(int i=0; i<20; i++){
            System.out.println("Element at index "+i+" = "+in.elementAt(i));
        }
        in.iterator();
        in.clear(); // Deletes all the elements from the vector.
    }
}
