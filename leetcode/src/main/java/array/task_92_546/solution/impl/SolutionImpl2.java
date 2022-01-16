package array.task_92_546.solution.impl;

import array.task_92_546.solution.Solution_92_546;

import java.util.HashMap;

/**
 * Good solution
 * Runtime: 2 ms
 * Memory Usage: 42.9 MB
 */
public class SolutionImpl2 implements Solution_92_546 {
    @Override
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int remained = target - nums[i];
            if (elements.containsKey(remained)) {
                return new int[]{elements.get(remained), i};
            }
            elements.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}
