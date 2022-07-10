package arrays;

import static sort.Sort.insertionSort;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        insertionSort(nums);
        int result = 0;
        int n = nums.length;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != i) {
                result = i;
                break;
            }
        }

        return result;
    }
}
