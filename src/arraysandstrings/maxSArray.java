package arraysandstrings;

import java.util.Arrays;

public class maxSArray {
    /*
    Given an integer array nums, find the subarray with the largest sum, and return its sum.

     Example 1:

    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
     */

    public static void main (String args[]){

        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {

            int ans = Integer.MIN_VALUE;
            int curr = 0;
            for (int num : nums){
                curr = Math.max(num, num+curr);
                ans = Math.max(ans, curr);
            }
            return ans;
        }




}
