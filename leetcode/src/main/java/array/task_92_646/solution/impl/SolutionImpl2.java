package array.task_92_646.solution.impl;

import array.task_92_646.solution.Solution;

/**
 * Runtime: 2 ms
 * Memory Usage: 56.3 MB
 */
public class SolutionImpl2 implements Solution {
    @Override
    public void rotate(int[] nums, int k) {
        if (nums == null || k <= 0 || nums.length < 2) {
            return;
        }

        int[] shiftedArray = new int[nums.length];
        for (int firstIndex = 0, shiftedIndex = firstIndex + k; firstIndex < nums.length; firstIndex++, shiftedIndex++) {
            shiftedArray[shiftedIndex % nums.length] = nums[firstIndex];
        }

        System.arraycopy(shiftedArray, 0, nums, 0, nums.length);
    }
}
