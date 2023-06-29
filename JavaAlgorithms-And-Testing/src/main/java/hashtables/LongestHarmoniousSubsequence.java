package hashtables;

import java.util.*;

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

        Collections.sort(keys);
        int longest = 0;

        for (int i = 0; i + 1 < keys.size(); i++) {
            if (keys.get(i + 1) - keys.get(i) == 1) {
                int length = map.get(keys.get(i + 1)) + map.get(keys.get(i));
                if (longest < length) {
                    longest = length;
                }
            }
        }

        return longest;
    }
}
