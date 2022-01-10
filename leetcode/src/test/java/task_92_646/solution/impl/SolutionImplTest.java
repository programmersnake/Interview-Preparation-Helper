package task_92_646.solution.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_92_646.solution.Solution;

class SolutionImplTest {

    private final Solution solutionImpl = new SolutionImpl();

    /**
     * Explanation:
     *     <p> * rotate 1 steps to the right: [7,1,2,3,4,5,6] </p>
     *     <p> * rotate 2 steps to the right: [6,7,1,2,3,4,5] </p>
     *     <p> * rotate 3 steps to the right: [5,6,7,1,2,3,4] </p>
     */
    @Test
    public void test() {
        int[] array = {1,2,3,4,5,6,7};
        int rotateCount = 3;
        int[] expectedResult = {5,6,7,1,2,3,4};
        solutionImpl.rotate(array, rotateCount);
        for (int i = 0; i < expectedResult.length; i++) {
            Assertions.assertEquals(expectedResult[i], array[i]);
        }
    }

}