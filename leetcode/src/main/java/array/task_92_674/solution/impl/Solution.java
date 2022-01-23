package array.task_92_674.solution.impl;

import array.task_92_674.solution.ISolution;

import java.util.Arrays;

/**
 * Runtime: 4 ms
 * Memory Usage: 40.3 MB
 */
public class Solution implements ISolution {

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        int intersectedNumber = 0;
        int[] intersectedArray = new int[Math.min(nums1.length, nums2.length)];

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                i++;
            } else if (nums1[i] > nums2[j]) {
                j++;
            } else {
                intersectedArray[intersectedNumber] = nums1[i];
                intersectedNumber++;
                i++;
                j++;

            }
        }
        return Arrays.copyOfRange(intersectedArray, 0, intersectedNumber);
    }
}
