// Question: Linear search algorithm for an array

package src.ds.Linear_Search;

public class ArrayLinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,23,4,5,42,7,86,21};
        int target = 42;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        if(arr.length == 0) return -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target) return i;
        }

        return -1;
    }
}
