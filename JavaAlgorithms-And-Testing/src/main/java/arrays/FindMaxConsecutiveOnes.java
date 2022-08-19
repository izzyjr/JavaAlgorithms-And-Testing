package arrays;

public class FindMaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int result = 0;
        int count = 0;
        int length = nums.length;

        for (int num : nums) {
            if (num == 1) {
                count++;
            } else {
                count = 0;
            }

            if (count > result) {
                result = count;

            }
        }

        return result;
    }
}
