package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(1, new ArrayList<>());
        map.put(0, new ArrayList<>());

        for (int num : nums) {
            if (!map.get(1).contains(num) && !map.get(0).contains(num)) {
                map.get(1).add(num);
            } else if (map.get(1).contains(num)) {
                map.get(1).remove((Integer) num);
                map.get(0).add(num);
            }
        }

        return map.get(1).get(0);
    }
}
