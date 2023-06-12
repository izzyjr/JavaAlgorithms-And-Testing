package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ContainsNearbyDuplicate {

    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (map.containsKey(num)) {
                map.get(num).add(i);
            } else {
                map.put(num, new ArrayList<>());
                map.get(num).add(i);
            }
        }

        for (ArrayList<Integer> duplicates : map.values()) {
            int size = duplicates.size();
            if (size > 1) {
                for (int i = 0; i < size; i++) {
                    for (int j = i + 1; j < size; j++) {
                        if (Math.abs(duplicates.get(j) - duplicates.get(i)) <= k) {
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }
}
