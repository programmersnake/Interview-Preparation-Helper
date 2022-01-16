package array.task_92_567.solution.impl;

import array.task_92_567.solution.Solution_92_567;

/**
 * Runtime: 4 ms
 * Memory Usage: 52.5 MB
 */
public class SolutionImpl2 implements Solution_92_567 {
    @Override
    public void moveZeroes(int[] nums) {
        int lastSavedPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 && nums[lastSavedPosition] == 0) {
                int temp = nums[i];
                nums[i] = nums[lastSavedPosition];
                nums[lastSavedPosition] = temp;
            }

            if (nums[lastSavedPosition] != 0) {
                lastSavedPosition++;
            }
        }
    }
}