package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();
        map.put(0, new ArrayList<>());

        for (int num : nums) {
            if (map.get(0).contains(num)) {
                map.get(0).remove((Integer) num);
            } else {
                map.get(0).add(num);
            }
        }

        return map.get(0).get(0);
    }
}
