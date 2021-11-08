// Question: Find the maximum and minimum value in an array.
package src.ds.Linear_Search;

public class Q3MinMax {
    public static void main(String[] args) {
        int[] arr = { 10, 20, -2, 421, 0, -9, 3, 21 };

        System.out.println("Max Num = " + max(arr));
        System.out.println("Min Num = " + min(arr));
    }

    static int min(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }

    static int max(int[] arr){
        int ans = arr[0];
        for(int i=1; i<arr.length; i++){
            if(ans < arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
}
