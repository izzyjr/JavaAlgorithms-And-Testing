package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static int longestHarmoniousSubsequence(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> keys = new ArrayList<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
                keys.add(num);
            }
        }

        int longest = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            for (Integer key : keys) {
                int sum = 0;
                if (entry.getKey() - key == 1) {
                    sum = entry.getValue() + map.get(key);
                    if (longest < sum) {
                        longest = sum;
                    }
                }
            }
        }

        return longest;
    }
}
