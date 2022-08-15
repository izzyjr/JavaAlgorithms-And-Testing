package arrays;

public class SearchInsert {

    public static int searchInsert(int[] nums, int target) {

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                result = i;
                break;
            }
        }

        return result;
    }
}
