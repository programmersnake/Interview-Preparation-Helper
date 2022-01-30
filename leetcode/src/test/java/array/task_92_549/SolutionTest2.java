package array.task_92_549;

import array.task_92_559.solution.impl.Solution2;
import array.task_92_559.solution.ISolution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_559.Solution")
class SolutionTest2 {

    private final ISolution solution = new Solution2();

    @Test
    public void test() {
        int[] array = {1, 2, 3};
        int[] actualResult = solution.plusOne(array);
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, actualResult);
    }

    @Test
    public void test2() {
        int[] array = {4, 3, 2, 1};
        int[] actualResult = solution.plusOne(array);
        Assertions.assertArrayEquals(new int[]{4, 3, 2, 2}, actualResult);
    }

    @Test
    public void test3() {
        int[] array = {9};
        int[] actualResult = solution.plusOne(array);
        Assertions.assertArrayEquals(new int[]{1, 0}, actualResult);
    }

    @Test
    public void test4() {
        int[] array = {1, 9};
        int[] actualResult = solution.plusOne(array);
        Assertions.assertArrayEquals(new int[]{2, 0}, actualResult);
    }

    @Test
    public void test5() {
        int[] array = {9, 9};
        int[] actualResult = solution.plusOne(array);
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, actualResult);
    }
}