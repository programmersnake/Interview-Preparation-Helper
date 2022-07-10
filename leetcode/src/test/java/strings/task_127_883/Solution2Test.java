package strings.task_127_883;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("strings.task_127_883.Solution2")
class Solution2Test {

    private final Solution2 solution = new Solution2();

    @Test
    public void test() {
        String input = "A man, a plan, a canal: Panama";
        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void test2() {
        String input = "race a car";
        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    public void test3() {
        String input = " ";
        Assertions.assertTrue(solution.isPalindrome(input));
    }

    @Test
    public void test4() {
        String input = "0P";
        Assertions.assertFalse(solution.isPalindrome(input));
    }

    @Test
    public void test5() {
        String input = "ab_a";
        Assertions.assertTrue(solution.isPalindrome(input));
    }

}