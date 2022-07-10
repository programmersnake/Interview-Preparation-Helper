package strings.task_127_883;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Runtime: 4 ms
 * Memory Usage: 42.3 MB
 */
public class Solution {

    public boolean isPalindrome(String s) {
        List<Character> listPrintableCharacters = new ArrayList<>();
        char[] chars = s.toLowerCase().toCharArray();
        for (char c : chars) {
            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) {
                listPrintableCharacters.add(c);
            }
        }

        for (int i = 0; i < listPrintableCharacters.size() / 2; i++) {
            if (listPrintableCharacters.get(i) != listPrintableCharacters.get(listPrintableCharacters.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
