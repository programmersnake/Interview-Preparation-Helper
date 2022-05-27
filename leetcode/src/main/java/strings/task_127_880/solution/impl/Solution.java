package strings.task_127_880.solution.impl;

import strings.task_127_880.solution.ISolution;

public class Solution implements ISolution {
    @Override
    public int reverse(int x) {
        boolean isNegative = false;
        long temp = x;
        if (temp < 0) {
            isNegative = true;
            temp *= (-1);
        }
        StringBuilder reversedStringValue = new StringBuilder();
        reversedStringValue.append(temp);
        reversedStringValue.reverse();

        if (Long.parseLong(reversedStringValue.toString()) >= Integer.MAX_VALUE) {
            return 0;
        }
        return (isNegative
                ? -1 * Integer.parseInt(reversedStringValue.toString())
                : Integer.parseInt(reversedStringValue.toString()));
    }

}
