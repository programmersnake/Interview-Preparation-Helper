package strings.task_127_882;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("strings.task_127_882.Solution")
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        String first = "anagram";
        String second = "nagaram";
        Assertions.assertTrue(solution.isAnagram(first, second));
    }

    @Test
    public void test2() {
        String first = "a";
        String second = "abc";
        Assertions.assertFalse(solution.isAnagram(first, second));
    }

}