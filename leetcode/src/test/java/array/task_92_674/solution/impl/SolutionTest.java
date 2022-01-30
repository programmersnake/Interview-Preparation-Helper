package array.task_92_674.solution.impl;

import array.task_92_674.solution.ISolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_674.Solution")
class SolutionTest {

    private final ISolution solution = new Solution();

    @Test
    public void test1() {
        int[] array1 = {1,2,2,1};
        int[] array2 = {2,2};
        int[] expectedResult = {2,2};
        int[] actualResult = solution.intersect(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        int[] array1 = {4,9,5};
        int[] array2 = {9,4,9,8,4};
        int[] expectedResult = {4,9};
        int[] actualResult = solution.intersect(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() {
        int[] array1 = {1,2};
        int[] array2 = {1,1};
        int[] expectedResult = {1};
        int[] actualResult = solution.intersect(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void test4() {
        int[] array1 = {2,6,2,9,1};
        int[] array2 = {7,1};
        int[] expectedResult = {1};
        int[] actualResult = solution.intersect(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    /*
    [2,6,2,9,1]
    [7,1]
     */
}