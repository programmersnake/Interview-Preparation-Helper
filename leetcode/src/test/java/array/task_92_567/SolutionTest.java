package array.task_92_567;

import array.task_92_567.solution.Solution_92_567;
import array.task_92_567.solution.impl.SolutionImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

@DisplayName("array.task_92_567.Solution2")
class SolutionTest {

    private final Solution_92_567 solution = new SolutionImpl();

    @Test
    public void test() {
        int[] array = {0, 1, 0, 3, 12};
        int[] expectedResult = {1, 3, 12, 0, 0};
        solution.moveZeroes(array);
        Assertions.assertArrayEquals(expectedResult, array);
    }

}