package array.task_92_578;

import array.task_92_578.solution.Solution92_578;
import array.task_92_578.solution.impl.SolutionImpl2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_578.Solution2")
public class Solution2Test {
    private final Solution92_578 solution = new SolutionImpl2();

    @Test
    public void test() {
        int[] array = {1, 9, 3, 9};
        boolean actualResult = solution.containsDuplicate(array);
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void test2() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        boolean actualResult = solution.containsDuplicate(array);
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void test3_NullArrayShouldBeFalse() {
        boolean actualResult = solution.containsDuplicate(null);
        Assertions.assertFalse(actualResult);
    }

}