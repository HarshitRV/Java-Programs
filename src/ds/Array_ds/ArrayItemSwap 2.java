package src.ds.Array_ds;

import java.util.Arrays;

public class ArrayItemSwap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        
        // Array before swapping
        System.out.println(Arrays.toString(arr));

        // Swapping the first and last element
        swap(arr, 0, 4);

        // Array after swapping
        System.out.println(Arrays.toString(arr));
    }

    //  Array swap method
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
