package mapslistsandBST.maps;

import java.util.*;

public class topKfrequentElements {
    /*
    Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

    Example 1:

    Input: nums = [1,1,1,2,2,3], k = 2

    Output: [1,2]

    Example 2:

    Input: nums = [1], k = 1

    Output: [1]

    Example 3:

    Input: nums = [1,2,1,2,1,2,3,1,3,2], k = 2

    Output: [1,2]
     */

    public int[] topKFrequent(int[] nums, int k) {
        // O(1) solution
        if(k==nums.length){
            return nums;
        }

        //O(N) solution -> First a map with (Number / Repetitions)
        Map<Integer, Integer> freq = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            freq.put(nums[i], freq.getOrDefault(nums[i], 0)+1);
        }

        // Heap with least frequent first
        Queue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> freq.get(n1) - freq.get(n2));

        //Fill heap
        for(int n : freq.keySet()){
            heap.add(n);
            if(heap.size()>k){
                heap.poll();
            }
        }

        //Convert from heap to solution
        int[] sol = new int[k];
        for(int i=0;i<k;i++){
            sol[i] = heap.poll();
        }

        return sol;
    }
}
