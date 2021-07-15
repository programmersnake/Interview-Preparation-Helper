package task1.solution;

public class Solution {

    /**
     * Time complexity O(n^2)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                int res = nums[i] + nums[j];
                if(res == target) {
                    result[0] = i;
                    result[1] = j;

                    return result;
                }
            }
        }
        return new int[] {-1,-1};
    }

}
