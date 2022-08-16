package arrays;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        int result = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] > target) {
                result = i;
                break;
            } else if (nums[i] == target) {
                result = i;
                break;
            } else if (nums[i] < target) {
                result = i + 1;
            }
        }

        return result;
    }
}
