package array.task_92_567.solution.impl;

import array.task_92_567.solution.Solution_92_567;

/**
 * Just iterate
 * Runtime: 144 ms
 * Memory Usage: 52.6 MB
 */
public class SolutionImpl implements Solution_92_567 {
    @Override
    public void moveZeroes(int[] nums) {
        int zerosCount = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) {
                shift(nums, i, zerosCount);
                zerosCount++;
            }
        }
    }

    private void shift(int[] nums, int zeroPosition, int zerosCount) {
        while (zeroPosition < nums.length - 1 - zerosCount) {
            int next = zeroPosition + 1;
            int temp = nums[zeroPosition];
            nums[zeroPosition] = nums[next];
            nums[next] = temp;
            zeroPosition++;
        }
    }
}
