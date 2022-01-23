package array.task_92_578.solution.impl;

import array.task_92_578.solution.ISolution;

import java.util.HashSet;
import java.util.Set;

/**
 * Simple.
 *
 * Runtime: 15 ms
 * Memory Usage: 73.5 MB
 */
public class Solution2 implements ISolution {
    @Override
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}
