package task10.solution;

class SolutionImpl implements Solution{
    public int removeDuplicates(int[] nums) {
        int duplicatesCount = 0;
        for (int firstIndex = 0; firstIndex <= nums.length - duplicatesCount; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex <= nums.length - duplicatesCount; secondIndex++) {
                if ((secondIndex >= nums.length - duplicatesCount) || (nums[firstIndex] != nums[secondIndex])) {
                    break;
                }

                shift(nums, secondIndex, duplicatesCount);
                duplicatesCount++;
                secondIndex--;
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