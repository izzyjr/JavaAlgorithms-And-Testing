package hashtables;

public class LongestHarmoniousSubsequence {

    public static int longestHarmoniousSubsequence(int[] nums) {

        int longest = 0;

        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            boolean minMax = false;
            for (int j = i + 1; j < nums.length; j++) {
                if (Math.abs(nums[i] - nums[j]) == 1) {
                    count++;
                    minMax = true;
                } else if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (longest < count && minMax) {
                longest = count;
            }
        }

        return longest;
    }
}
