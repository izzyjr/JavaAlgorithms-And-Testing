package hashtables;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {

    public static int longestHarmoniousSubsequence(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int longest = 0;

        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);
                if (longest < length) {
                    longest = length;
                }
            }
        }

        return longest;
    }
}
