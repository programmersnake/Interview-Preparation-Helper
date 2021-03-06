package array.task_92_564.solution.impl;

import array.task_92_564.solution.ISolution;

import java.util.stream.IntStream;

/**
 * Runtime: 5 ms
 * Memory Usage: 41.4 MB
 *
 * Too long time, but less code.
 * First solution I like more.
 */
public class Solution2 implements ISolution {
    @Override
    public int maxProfit(int[] prices) {
        return IntStream.range(0, prices.length - 1)
                .filter(i -> prices[i] < prices[i + 1])
                .map(i -> (prices[i + 1] - prices[i]))
                .sum();
    }
}
