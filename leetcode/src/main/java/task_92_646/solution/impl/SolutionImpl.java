package task_92_646.solution.impl;

import task_92_646.solution.Solution;

public class SolutionImpl implements Solution {
    @Override
    public void rotate(int[] nums, int k) {
        if (k <= 0 || nums.length < 1) {
            return;
        }
        int lastValue = nums[1];
        while (k > 0) {
            for (int firstI = 0, secondI = 1; firstI < nums.length; firstI++, secondI++) {
                if (firstI == 0) {
                    lastValue = nums[secondI];
                    nums[secondI] = nums[firstI];
                } else if (firstI == nums.length-1) {
                    nums[0] = lastValue;
                } else {
                    int tempValue = nums[secondI];
                    nums[secondI] = lastValue;
                    lastValue = tempValue;
                }
            }
            k--;
        }
    }
}
