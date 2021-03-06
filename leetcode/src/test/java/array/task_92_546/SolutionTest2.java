package array.task_92_546;

import array.task_92_546.solution.ISolution;
import array.task_92_546.solution.impl.Solution2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_546.Solution2")
public class SolutionTest2 {
    private final ISolution solution = new Solution2();

    @Test
    public void test() {
        int[] array = {2, 7, 11, 15};
        int[] actualResult = solution.twoSum(array, 9);
        Assertions.assertArrayEquals(new int[]{0, 1}, actualResult);
    }
}
