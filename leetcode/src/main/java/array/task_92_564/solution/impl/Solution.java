package array.task_92_564.solution.impl;

import array.task_92_564.solution.ISolution;

/**
 * Runtime: 1 ms
 * Memory Usage: 38.8 MB
 */
public class Solution implements ISolution {
    @Override
    public int maxProfit(int[] prices) {
        int maxProfit = 0;

        for (int currentDay = 0, nextDay = 1; nextDay < prices.length; currentDay++, nextDay++) {
            int currentPrice = prices[currentDay];
            int nextPrice = prices[nextDay];
            if (currentPrice < nextPrice) {
                maxProfit += nextPrice - currentPrice;
            }
        }
        return maxProfit;
    }
}
