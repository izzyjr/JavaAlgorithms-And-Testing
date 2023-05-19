package arrays;

public class TargetSum {

    public static int[] targetSum(int[] nums, int target) {

        int[] targets = new int[2];

        outer:
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    targets[0] = i;
                    targets[1] = j;
                    break outer;
                }
            }
        }

        return targets;
    }
}
