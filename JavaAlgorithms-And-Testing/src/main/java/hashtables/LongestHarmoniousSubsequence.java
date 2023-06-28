package hashtables;

public class LongestHarmoniousSubsequence {

    public static int longestHarmoniousSubsequence(int[] nums) {

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int max = 0;
            int min = 0;
            int count = 0;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] == 1) {
                    max = nums[i];
                    min = nums[j];
                    break;
                } else if (nums[i] - nums[j] == -1) {
                    max = nums[j];
                    min = nums[i];
                    break;
                }
            }
            for (int x = i; x < nums.length; x++) {
                if (nums[x] == max || nums[x] == min) {
                    count++;
                }
            }
            if (longest < count) {
                longest = count;
            }
        }

        return longest;
    }
}
