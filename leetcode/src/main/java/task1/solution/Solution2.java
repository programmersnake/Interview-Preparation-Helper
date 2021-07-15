package task1.solution;

import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Solution2 {

    /**
     * Time complexity O(n)
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> elements = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int remained = target - nums[i];

            if(elements.containsKey( remained )) {
                return new int[] {elements.get( remained ), i};
            }

            elements.put( nums[i], i );

        }
        return new int[] {-1,-1};
    }

}
