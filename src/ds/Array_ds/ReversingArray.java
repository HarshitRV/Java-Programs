package src.ds.Array_ds;
import java.util.Arrays;

class ReversingArrayMethod1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9};
        // array
        System.out.println("Original array 1: "+Arrays.toString(arr));
        // calling reverseArray method
        reverseArray(arr);

        // printing the reversed array
        System.out.println("Reversed array 1: "+Arrays.toString(arr));

        int[] arr2 = {9,8,7,6,5,4,3,2,1};
        // array arr2
        System.out.println("Original array 2: "+Arrays.toString(arr2));
        // calling reverseArrayM2 method
        reverseArrayM2(arr2);
        // printing the reversed array
        System.out.println("Reversed array 2: "+Arrays.toString(arr2));

        int arr3[] = {10,20,30,40,50,60,70,80,90};
        System.out.println("Original array 3: "+Arrays.toString(arr3));

        // calling optimumReverseArray method
        optimumReverseArray(arr3);
        System.out.println("Reversed array 3: "+Arrays.toString(arr3));
    }

    // long way to reverse an array
    static void reverseArray(int [] arr) {
        int start = 0;
        int new_arr[] = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--) {
            new_arr[start++] = arr[i];
        }

        for(int i=0; i<arr.length; i++) {
            arr[i] = new_arr[i];
        }
    }

    // method to find number of swaps required to reverse the array
    static int swaps(int size){
        if (size == 1)
            return 0;
        else
            if(size%2!=0){
                size-=1;
            }
            return size/2;
    }

    // My way of reversing the array.
    static void reverseArrayM2(int[] arr){
        System.out.println("Swaps: "+swaps(arr.length));
        for(int i=0; i<swaps(arr.length); i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-(i+1)];
            arr[arr.length-(i+1)] = temp;
        }
    }

    // Optimum way to reverse an array
    // Making use of array element swap method

    // Method to swap two elements in an array.
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void optimumReverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}
