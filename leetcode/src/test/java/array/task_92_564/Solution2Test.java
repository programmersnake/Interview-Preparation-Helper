package array.task_92_564;

import array.task_92_564.solution.impl.SolutionImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import array.task_92_564.solution.Solution;

public class Solution2Test {

    private final Solution solutionImpl = new SolutionImpl2();

    /**
     * Explanation: Buy on day 2 (price = 1) and sell on day 3 (price = 5), profit = 5-1 = 4.
     * Then buy on day 4 (price = 3) and sell on day 5 (price = 6), profit = 6-3 = 3.
     * Total profit is 4 + 3 = 7.
     */
    @Test
    public void test() {
        int[] array = {7, 1, 5, 3, 6, 4};
        int expectedResult = 7;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * Explanation: Buy on day 1 (price = 1) and sell on day 5 (price = 5), profit = 5-1 = 4.
     * Total profit is 4.
     */
    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4, 5};
        int expectedResult = 4;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    /**
     * Explanation: There is no way to make a positive profit, so we never buy the stock to achieve
     * the maximum profit of 0.
     */
    @Test
    public void test3() {
        int[] array = {7, 6, 4, 3, 1};
        int expectedResult = 0;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test4() {
        int[] array = {7, 6, 4, 3, 1, 3, 5};
        int expectedResult = 4;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test5() {
        int[] array = {1, 2, 14, 13, 11, 13, 5};
        int expectedResult = 15;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test6() {
        int[] array = {1, 2};
        int expectedResult = 1;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test7() {
        int[] array = {2, 1, 4};
        int expectedResult = 3;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test8() {
        int[] array = {4, 1, 2};
        int expectedResult = 1;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test9() {
        int[] array = {2, 2, 5};
        int expectedResult = 3;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test10() {
        int[] array = {2, 1, 4, 5, 2, 9, 7};
        int expectedResult = 11;
        int actualResult = solutionImpl.maxProfit(array);
        Assertions.assertEquals(expectedResult, actualResult);
    }
}