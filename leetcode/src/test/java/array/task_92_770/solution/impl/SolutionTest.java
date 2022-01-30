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

    @Test
    public void test3() {
        int[][] inputArray = {
                {26, 27, 28, 11, 17},
                {29, 30, 31, 10, 18},
                {13, 32, 33, 34, 19},
                {15, 14, 12, 16, 20},
                {21, 22, 23, 24, 25}
        };
        int[][] expectedResult = {
                {21, 15, 13, 29, 26},
                {22, 14, 32, 30, 27},
                {23, 12, 33, 31, 28},
                {24, 16, 34, 10, 11},
                {25, 20, 19, 18, 17}
        };
        solution.rotate(inputArray);
        Assertions.assertArrayEquals(expectedResult, inputArray);
    }

    @Test
    public void test4() {
        int[][] inputArray = {
                {26, 27, 28, 11, 17, 37},
                {29, 30, 31, 10, 18, 38},
                {13, 32, 33, 34, 19, 39},
                {15, 14, 12, 16, 20, 29},
                {21, 22, 23, 24, 25, 30},
                {31, 32, 33, 34, 35, 36}
        };
        int[][] expectedResult = {
                {31, 21, 15, 13, 29, 26},
                {32, 22, 14, 32, 30, 27},
                {33, 23, 12, 33, 31, 28},
                {34, 24, 16, 34, 10, 11},
                {35, 25, 20, 19, 18, 17},
                {36, 30, 29, 39, 38, 37}
        };
        solution.rotate(inputArray);
        Assertions.assertArrayEquals(expectedResult, inputArray);
    }

}