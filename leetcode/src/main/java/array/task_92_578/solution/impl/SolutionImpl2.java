package array.task_92_578.solution.impl;

import array.task_92_578.solution.Solution92_578;

import java.util.HashSet;
import java.util.Set;

/**
 * Simple.
 *
 * Runtime: 15 ms
 * Memory Usage: 73.5 MB
 */
public class SolutionImpl2 implements Solution92_578 {
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
