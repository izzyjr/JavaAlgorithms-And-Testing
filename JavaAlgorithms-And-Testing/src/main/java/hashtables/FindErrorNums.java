package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindErrorNums {

    public static int[] findErrorNums(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.replace(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int length = nums.length;

        for (int j = 1; j <= length; j++) {
            if (map.containsKey(j)) {
                if (map.get(j) > 1) {
                    result[0] = j;
                }
            } else {
                result[1] = j;
            }
        }

        return result;
    }
}
