// Question: Linear search in an array with start and end values given.
package src.ds.Linear_Search;

public class Q2SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,2,34,53,12,12,-1,90};
        int target = 34, start = 1, end = 3;

        System.out.println(search(arr, target, start, end));
    }

    static int search(int[] arr, int target, int start, int end){
        if(arr.length == 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(target == arr[i])
                return i;
        }

        return -1;
    }
}
