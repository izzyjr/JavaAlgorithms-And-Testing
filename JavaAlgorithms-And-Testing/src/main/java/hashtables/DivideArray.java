package hashtables;

import java.util.HashMap;
import java.util.Map;

public class DivideArray {

    public static boolean divideArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int val : map.values()) {
            if (val % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}
