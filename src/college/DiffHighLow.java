package src.college;
import java.io.*;

public class DiffHighLow {
    public static void main(String[] args) {
        Console c = System.console();
        int arr[] = new int[5], max = 0, min = 0;

        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(c.readLine("Enter num at index "+(i+1)+":"));
            
            if (max == 0 && min == 0){
                max = arr[i];
                min = arr[i];
            }
            
            // System.out.println(max < arr[i]);
            if(max < arr[i])
                max = arr[i];

            // System.out.println(min > arr[i]);
            if(min > arr[i])
                min = arr[i];
        }
        // System.out.println(max);
        // System.out.println(min);
        System.out.println("Diff between min and max = "+(max-min));

    }
}
