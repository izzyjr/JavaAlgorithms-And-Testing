package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindShortestSubArray {

    public static int findShortestSubArray(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int max = 1;

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
                if (max < map.get(num)) {
                    max = map.get(num);
                }
            } else {
                map.put(num, 1);
            }
        }

        List<Integer> degrees = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                degrees.add(entry.getKey());
            }
        }

        int shortestLength = nums.length;

        for (int degree : degrees) {
            int count = 0;
            int degreeCount = 0;
            for (int j = 0; j < nums.length; j++) {
                if (degree == nums[j]) {
                    while (j < nums.length && degreeCount < max) {
                        if (nums[j] == degree) {
                            degreeCount++;
                        }
                        count++;
                        j++;
                    }
                }
            }
            if (shortestLength > count) {
                shortestLength = count;
            }
        }

        return shortestLength;
    }
}
