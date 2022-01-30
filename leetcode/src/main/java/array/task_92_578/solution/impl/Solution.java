package array.task_92_578.solution.impl;

import array.task_92_578.solution.ISolution;

import java.util.HashSet;
import java.util.Set;

/**
 * Simple.
 *
 * Runtime: 6 ms
 * Memory Usage: 52.5 MB
 */
public class Solution implements ISolution {
    @Override
    public boolean containsDuplicate(int[] nums) {
        if (nums == null) {
            return false;
        }

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return true;
            }
        }

        return false;
    }
}
