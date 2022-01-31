package strings.task_127_879.solution.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import strings.task_127_879.solution.ISolution;

@DisplayName("array.task_127_879.Solution")
class SolutionTest {

    private final ISolution solution = new Solution();

    @Test
    public void test() {
        char[] inputArray = {'h','e','l','l','o'};
        char[] expectedResult = {'o','l','l','e','h'};
        solution.reverseString(inputArray);
        Assertions.assertArrayEquals(expectedResult, inputArray);
    }

}