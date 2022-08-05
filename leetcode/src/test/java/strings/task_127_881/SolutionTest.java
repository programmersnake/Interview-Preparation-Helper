package strings.task_127_881;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

@DisplayName("array.task_127_881.Solution")
class SolutionTest {

    private final Solution solution = new Solution();

    @Test
    public void test() {
        String input = "leetcode";
        int expectedResult = 0;
        Assertions.assertEquals(expectedResult, solution.firstUniqChar(input));
    }

    @Test
    public void test2() {
        String input = "loveleetcode";
        int expectedResult = 2;
        Assertions.assertEquals(expectedResult, solution.firstUniqChar(input));
    }

    @Test
    public void test3() {
        String input = "aabb";
        int expectedResult = -1;
        Assertions.assertEquals(expectedResult, solution.firstUniqChar(input));
    }

}