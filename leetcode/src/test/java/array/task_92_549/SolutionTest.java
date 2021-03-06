package array.task_92_549;

import array.task_92_549.solution.ISolution;
import array.task_92_549.solution.impl.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_549.Solution")
public class SolutionTest {

    private final ISolution solution = new Solution();

    @Test
    public void test() {
        int[] array = {2,2,1};
        int actualResult = solution.singleNumber(array);
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    public void test2() {
        int[] array = {1};
        int actualResult = solution.singleNumber(array);
        Assertions.assertEquals(1, actualResult);
    }

    @Test
    public void test3() {
        int[] array = {4,5,5,1,2,2,1};
        int actualResult = solution.singleNumber(array);
        Assertions.assertEquals(4, actualResult);
    }
}