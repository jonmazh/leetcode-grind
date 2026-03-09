package arraysandstrings;
/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

 */

import java.util.Arrays;

public class twoSum {
    public static void main (String args[]){
        int[] nums = new int[]{2,7, 11, 15};

        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int x = 0; x < nums.length; x++) {
            for (int y = 0; y < nums.length; y++) {
                if ((nums[x] + nums[y] == target) && (x != y)) {
                    return new int[]{x, y};
                }
            }
        }
        return null;
    }



}
