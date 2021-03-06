package array.task_92_646.solution.impl;

import array.task_92_646.solution.ISolution;

/**
 * Long time for huge arrays
 */
public class Solution implements ISolution {
    @Override
    public void rotate(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length < 1) {
            return;
        }
        int lastValue = nums[1];
        while (k > 0) {
            for (int firstI = 0, secondI = 1; firstI < nums.length; firstI++, secondI++) {
                if (firstI == 0) {
                    lastValue = nums[secondI];
                    nums[secondI] = nums[firstI];
                } else if (firstI == nums.length - 1) {
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
