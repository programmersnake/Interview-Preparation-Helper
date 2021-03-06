package array.task_92_559.solution.impl;

import array.task_92_559.solution.ISolution;

/**
 * Runtime: 1 ms
 * Memory Usage: 39.6 MB
 */
public class Solution2 implements ISolution {
    @Override
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] resultArrayForOneCondition = new int[digits.length + 1];
        resultArrayForOneCondition[0] = 1;
        return resultArrayForOneCondition;
    }
}
