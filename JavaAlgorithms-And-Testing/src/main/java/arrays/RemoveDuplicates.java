package arrays;

import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicates {

    public static int[] removeDuplicates(int[] nums) {

        Map<Integer, Integer> hashMap = new HashMap<>();
        int index = 0;

        for (int num : nums) {
            if (!hashMap.containsKey(num)) {
                hashMap.put(num, index);
                index++;
            }
        }

        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            nums[entry.getValue()] = entry.getKey();
        }

        return nums;
    }
}
