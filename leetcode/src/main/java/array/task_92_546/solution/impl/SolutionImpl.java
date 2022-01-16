package array.task_92_546.solution.impl;

import array.task_92_546.solution.Solution_92_546;

/**
 * Not good solution
 * Runtime: 105 ms
 * Memory Usage: 42.1 MB
 */
public class SolutionImpl implements Solution_92_546 {
    @Override
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int res = nums[i] + nums[j];
                if (res == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }
        return new int[]{-1, -1};
    }
}
