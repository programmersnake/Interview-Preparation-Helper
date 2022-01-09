package task10.solution;

public class SolutionImpl2 implements Solution{
    public int removeDuplicates(int[] nums) {
        int duplicatesCount = 0;
        for (int firstIndex = 0; firstIndex <= nums.length - duplicatesCount; firstIndex++) {
            int secondIndex = firstIndex + 1;
            while (secondIndex <= nums.length - 1 - duplicatesCount) {
                if (nums[firstIndex] != nums[secondIndex]) {
                    break;
                }

                shift(nums, secondIndex, duplicatesCount);
                duplicatesCount++;
            }
        }
        return nums.length - duplicatesCount;
    }

    private void shift(int[] nums, int currentIndex, int duplicatesCount) {
        for (int firstIndex = currentIndex; firstIndex <= nums.length - duplicatesCount; firstIndex++) {
            int secondIndex = firstIndex + 1;
            if (secondIndex >= nums.length) {
                nums[firstIndex] = -1;
                break;
            }
            nums[firstIndex] = nums[secondIndex];
        }
    }
}
