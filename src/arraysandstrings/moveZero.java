package arraysandstrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.



Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 */
public class moveZero {

    public static void main (String args[]){
        moveZeroes(new int[]{1, 0, 12, 0, 9});
    }

    public static void moveZeroes(int[] nums) {
        int tailPointer = nums.length-1;
        for(int i = 0 ; i < tailPointer ; i++){
            if(nums[i]==0){
                int aux = nums[tailPointer];
                nums[i] = aux ;
                nums[tailPointer] = 0;
                tailPointer--;
            }
        }
    }
}
