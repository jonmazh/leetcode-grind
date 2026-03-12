package mapslistsandBST.BS;

import com.sun.source.tree.Tree;

import java.util.Arrays;

public class BS {

    /*
    Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.
    You must write an algorithm with O(log n) runtime complexity.

    Example 1:

    Input: nums = [-1,0,3,5,9,12], target = 9
    Output: 4
    Explanation: 9 exists in nums and its index is 4
    Example 2:

    Input: nums = [-1,0,3,5,9,12], target = 2
    Output: -1
    Explanation: 2 does not exist in nums so return -1
     */
    public static void main(String args[]) {
        System.out.println(search(new int[]{1,2,3,4,5,6,8,9,10,12,15,17}, 9));
    }

    public static int search(int[] nums, int target) {
        int startingIndex = 0;
        int endingIndex = nums.length-1;

        while (startingIndex<=endingIndex) {
            int middle = (startingIndex+endingIndex)/2;
            if(nums[middle]>target){
                endingIndex = middle-1;
            }
            else if(nums[middle]==target){
                return middle;
            }
            else if(nums[middle]<target){
                startingIndex = middle+1;
            }
        }

        return -1;
    }

}
