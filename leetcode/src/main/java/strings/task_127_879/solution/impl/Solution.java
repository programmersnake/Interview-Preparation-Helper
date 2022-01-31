package strings.task_127_879.solution.impl;

import strings.task_127_879.solution.ISolution;

/**
 * Runtime: 0 ms
 * Memory Usage: 49.5 MB
 */
public class Solution implements ISolution {
    @Override
    public void reverseString(char[] s) {
        int arrayLength = s.length - 1;
        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[arrayLength - i];
            s[arrayLength - i] = temp;
        }
    }
}
