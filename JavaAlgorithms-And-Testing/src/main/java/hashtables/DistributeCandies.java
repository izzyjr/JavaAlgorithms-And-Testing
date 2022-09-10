package hashtables;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {

        int length = candyType.length;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : candyType) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.replace(i, map.get(i + 1));
            }
        }

        int average = length / map.size();

        return length / average;
    }
}
