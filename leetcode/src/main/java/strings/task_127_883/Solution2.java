package strings.task_127_883;

import java.util.ArrayDeque;
import java.util.stream.Collectors;

/**
 * Long-time solution :(
 *
 * Runtime: 25 ms
 * Memory Usage: 45.1 MB
 */
public class Solution2 {
    public boolean isPalindrome(String s) {
        ArrayDeque<Character> characterQueue = s.toLowerCase().chars()
                .mapToObj(value -> (char) value)
                .filter(c -> (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')).collect(Collectors.toCollection(ArrayDeque::new));

        while (characterQueue.size() > 1) {
            Character first = characterQueue.removeFirst();
            Character last = characterQueue.removeLast();
            if (!first.equals(last)) {
                return false;
            }
        }
        return true;
    }
}
