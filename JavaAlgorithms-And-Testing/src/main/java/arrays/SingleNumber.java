package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        int length = nums.length;
        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int num : nums) {
            if (map.isEmpty()) {
                map.put(1, new ArrayList<>(List.of(num)));
            } else if (map.get(1).contains(num)) {
                map.get(1).remove((Integer) num);
                map.put(2, new ArrayList<>(List.of(num)));
            } else {
                if (map.containsKey(2)) {
                    if (!map.get(2).contains(num)) {
                        map.get(1).add(num);
                    }
                } else {
                    map.get(1).add(num);
                }
            }
        }

        return map.get(1).get(0);
    }
}
