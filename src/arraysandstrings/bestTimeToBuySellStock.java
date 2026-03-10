package arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
Example 2:

Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.

*/

public class bestTimeToBuySellStock {
    public static void main (String args[]){
        System.out.println(maxProfit(new int[]{2,4,1}));
    }
    // Kadane's Algorithm
    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for (int i = 1 ; i < prices.length ; i++) {
            buy = Math.min(buy, prices[i]);
            profit = Math.max(prices[i]-buy, profit);
        }
        return profit;
    }
    /*
    [1, 2] -> min = 1

    [2, 4, 1] -> min = 2, max = -1, minIndex = 0





    0 - [.7, 6, 5 ,4, 3] min=7, minIndex=-1, max=-1
    1 - [7, .6, 5, 4, 3] min=6, minIndex=1, max=6
    2 - [7, 6, .5, 4, 3] min=5, minIndex=2, max=6
     */
}
