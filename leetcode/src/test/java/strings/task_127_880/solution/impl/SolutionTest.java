package strings.task_127_880.solution.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strings.task_127_880.solution.ISolution;

@DisplayName("array.task_127_880.Solution")
class SolutionTest {

    private final ISolution solution = new Solution();

    @Test
    public void test() {
        int input = 123;
        int expectedResult = 321;
        Assertions.assertEquals(expectedResult, solution.reverse(input));
    }

    /**
     * 0 - because 9646324351L is more than the Max available value of the Integer
     */
    @Test
    public void test2() {
        int input = 1534236469;
        long expectedResult = 0;
        Assertions.assertEquals(expectedResult, solution.reverse(input));
    }

}