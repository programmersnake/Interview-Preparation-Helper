package task1.solution;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void twoSumSouldBe9() {
        int nums[] = {2,11,7,15};
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
    void twoSumSouldBe6() {
        int nums[] = {3,2,4};
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
    void twoSumSouldBe6_1() {
        int nums[] = {3,3};
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
    void twoSumSouldNotFindSolution() {
        int nums[] = {2,11,19,0};
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