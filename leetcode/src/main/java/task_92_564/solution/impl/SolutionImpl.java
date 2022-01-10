package task_92_564.solution.impl;

/**
 * Runtime: 1 ms
 * Memory Usage: 38.8 MB
 */
public class SolutionImpl implements task_92_564.solution.Solution {
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
