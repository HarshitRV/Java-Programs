// Linear search in 2D array.

package src.ds.Linear_Search;

import java.util.Arrays;

public class Q4SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,23,123},
            {2,13,2},
            {2,12}
        };

        int target = 12;
        int[] index = search(arr, target);
        System.out.println(Arrays.toString(index));
    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1,-1};
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr[i].length; j++){
                if(target == arr[i][j]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
