package strings.task_127_882;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            list.add(c);
        }

        char[] chars = t.toCharArray();
        for (char c : chars) {
            if (list.contains(c)) {
                list.remove(Character.valueOf(c));
            } else {
                return false;
            }
        }
        return true;
    }

}
