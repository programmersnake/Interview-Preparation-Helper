package strings.task_127_881;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (map.containsKey(c)) {
                map.remove(c);
            } else {
                map.put(c, i);
            }
        }
        return map.values().stream().min(Integer::compare).orElse(-1);
    }

}
