package mapslistsandBST.BS;

    /*
    A peak element is an element that is strictly greater than its neighbors.

    Given a 0-indexed integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.

    You may imagine that nums[-1] = nums[n] = -∞. In other words, an element is always considered to be strictly greater than a neighbor that is outside the array.

    You must write an algorithm that runs in O(log n) time.

    Example 1:

    Input: nums = [1,2,3,1]
    Output: 2
    Explanation: 3 is a peak element and your function should return the index number 2.
    Example 2:

    Input: nums = [1,2,1,3,5,6,4]
    Output: 5
    Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
     */
public class findPeakElement {

    public static void main(String args[]){
        System.out.println(findPeakElement(new int[]{1,2}));
    }

    //        int sol = nums[0];
        //        int i = 0;
        //        if(nums.length == 1){
        //            return 0;
        //        }
        //        while(sol<=nums[i+1]&&i!=nums.length-1){
        //            i++;
        //            sol = nums[i];
        //        }
        //        return i;

        public static int findPeakElement(int[] nums) {
            int sol = nums[0];
            int i = 0;
            if(nums.length == 1){
               return 0;
            }
            while(sol<=nums[i+1] ){
                i++;
                sol = nums[i];
                if (i == nums.length - 1){
                    return i;
                }
            }
            return i;
        }
}
