package array.task_92_646;

import array.task_92_646.solution.ISolution;
import array.task_92_646.solution.impl.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("array.task_92_646.Solution")
class SolutionTest {

    private final ISolution solutionImpl = new Solution();

    /**
     * Explanation:
     * <p> * rotate 1 steps to the right: [7,1,2,3,4,5,6] </p>
     * <p> * rotate 2 steps to the right: [6,7,1,2,3,4,5] </p>
     * <p> * rotate 3 steps to the right: [5,6,7,1,2,3,4] </p>
     */
    @Test
    public void test() {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int rotateCount = 3;
        int[] expectedResult = {5, 6, 7, 1, 2, 3, 4};
        solutionImpl.rotate(array, rotateCount);
        for (int i = 0; i < expectedResult.length; i++) {
            Assertions.assertEquals(expectedResult[i], array[i]);
        }
    }
}