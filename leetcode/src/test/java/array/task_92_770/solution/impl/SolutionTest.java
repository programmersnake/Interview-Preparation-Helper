package array.task_92_770.solution.impl;

import array.task_92_770.solution.ISolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_770.Solution")
class SolutionTest {

    private final ISolution solution = new Solution();

    @Test
    public void test() {
        int[][] inputArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expectedResult = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        solution.rotate(inputArray);
        Assertions.assertArrayEquals(expectedResult, inputArray);
    }

    @Test
    public void test2() {
        int[][] inputArray = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expectedResult = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};
        solution.rotate(inputArray);
        Assertions.assertArrayEquals(expectedResult, inputArray);
    }

}