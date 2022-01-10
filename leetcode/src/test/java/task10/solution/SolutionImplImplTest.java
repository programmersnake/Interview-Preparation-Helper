package task10.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task10.solution.impl.SolutionImpl;

class SolutionImplImplTest {

    private Solution solution = new SolutionImpl();

    @Test
    public void shouldReturn5() {
        int[] array = {1, 3, 5, 5, 6, 6, 7};
        int[] expectedArray = {1, 3, 5, 6, 7};
        int resultValue = solution.removeDuplicates(array);
        Assertions.assertEquals(expectedArray.length, resultValue);

        for (int i = 0; i < resultValue; i++) {
            assert array[i] == expectedArray[i];
        }
    }

    @Test
    public void shouldReturn7() {
        int[] array = {1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 5, 5, 6, 6, 7};
        int[] expectedArray = {1, 2, 3, 4, 5, 6, 7};
        int resultValue = solution.removeDuplicates(array);
        Assertions.assertEquals(expectedArray.length, resultValue);

        for (int i = 0; i < resultValue; i++) {
            assert array[i] == expectedArray[i];
        }
    }

    @Test
    public void shouldBeCorrectWithEmptyArray() {
        int[] array = new int[]{};
        int[] expectedArray = new int[]{};
        int resultValue = solution.removeDuplicates(array);
        Assertions.assertEquals(expectedArray.length, resultValue);
    }

}