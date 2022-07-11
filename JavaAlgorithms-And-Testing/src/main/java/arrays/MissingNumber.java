package arrays;

import static sort.Sort.insertionSort;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        insertionSort(nums);
        int result = 0;
        int length = nums.length;

        for (int i = 0; i < length; i++) {
            if (nums[i] != i) {
                result = i;
                break;
            }
        }

        if (nums[0] == 0 && result == 0) {
            result = length;
        }

        return result;
    }
}
