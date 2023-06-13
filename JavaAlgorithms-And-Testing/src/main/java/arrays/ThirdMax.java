package arrays;

import java.util.Arrays;
import java.util.TreeMap;

public class ThirdMax {

    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int i = nums.length - 1; i >= 0; i--) {
            int num = nums[i];
            if (!tree.containsKey(num)) {
                tree.put(num, 1);
                if (tree.size() == 3) {
                    return num;
                }
            }
        }

        return nums[nums.length - 1];
    }
}
