// Two Sum
// link: https://leetcode.com/problems/two-sum/

package src.ds.Linear_Search;
import java.util.Arrays;
public class Q6TwoSum {
    public static void main(String[] args) {
        // Our array
        int[] nums = {2,5,5,11};
        // int[] nums2 = {2,5,5,11};
        // int target2 = 10;

        // this is target
        int target = 10;

        // calling and printing the indices of the 
        // number meeting the target sum
        int[] ans = twoSum(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] twoSum(int[] nums, int target) {
        int sum = 0;
    
        for (int i=0; i<nums.length; i++){
            for (int j=1; j<=nums.length -1; j++){
              sum = nums[i] + nums[j];
                   // 3     +   3
              if(sum == target){
                //6   ==  6
                // if found return the indices array
                if(i != j){
                return new int[]{i, j};
                }
              }
            }
        }
        // if not found returen -1, -1
        return new int[]{-1, -1};
    }
    
}
