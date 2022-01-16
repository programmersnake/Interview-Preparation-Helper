package problems.task10;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import problems.task1.solution.Solution;

@DisplayName("problems.task10.Solution")
class SolutionTest {

    @Test
    void twoSumShouldBe9() {
        int[] nums = {2,11,7,15};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum( nums, target );

        Assertions.assertAll( () -> {
                Assertions.assertEquals( 0, result[0] );
                Assertions.assertEquals( 2, result[1] );
            }
        );
    }

    @Test
    void twoSumShouldBe6() {
        int[] nums = {3,2,4};
        int target = 6;

        Solution solution = new Solution();
        int[] result = solution.twoSum( nums, target );

        Assertions.assertAll( () -> {
                    Assertions.assertEquals( 1, result[0] );
                    Assertions.assertEquals( 2, result[1] );
                }
        );
    }

    @Test
    void twoSumShouldBe6_1() {
        int[] nums = {3,3};
        int target = 6;

        Solution solution = new Solution();
        int[] result = solution.twoSum( nums, target );

        Assertions.assertAll( () -> {
                    Assertions.assertEquals( 0, result[0] );
                    Assertions.assertEquals( 1, result[1] );
                }
        );
    }

    @Test
    void twoSumShouldNotFindSolution() {
        int[] nums = {2,11,19,0};
        int target = 9;

        Solution solution = new Solution();
        int[] result = solution.twoSum( nums, target );

        Assertions.assertAll( () -> {
                    Assertions.assertEquals( -1, result[0] );
                    Assertions.assertEquals( -1, result[1] );
                }
        );
    }
}