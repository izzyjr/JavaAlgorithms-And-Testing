package hashtables;

import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
        }

        for (int num1 : map.keySet()) {
            for (int num2 : map.keySet()) {
                if (num1 != num2) {
                    if (Math.abs(num1 - num2) <= k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
