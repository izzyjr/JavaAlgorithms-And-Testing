package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappeared = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
        }

        for (int j = 1; j < nums.length + 1; j++) {
            if (!map.containsKey(j)) {
                disappeared.add(j);
            }
        }

        return disappeared;
    }
}
