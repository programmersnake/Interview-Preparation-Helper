package array.task_92_567;

import array.task_92_567.solution.ISolution;
import array.task_92_567.solution.impl.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_567.Solution2")
class SolutionTest2 {

    private final ISolution solution = new Solution2();

    @Test
    public void test() {
        int[] array = {0, 1, 0, 3, 12};
        int[] expectedResult = {1, 3, 12, 0, 0};
        solution.moveZeroes(array);
        Assertions.assertArrayEquals(expectedResult, array);
    }

}