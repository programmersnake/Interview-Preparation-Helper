package array.task_92_549.solution.impl;

import array.task_92_549.solution.Solution92_549;

public class SolutionImpl implements Solution92_549 {

    /**
     * Rules:
     * a XOR 0 = a;
     * a XOR a = 0;
     * a XOR b = b XOR a;
     * (a XOR b) XOR b = a;
     * @param nums array values
     * @return single number
     */
    @Override
    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
