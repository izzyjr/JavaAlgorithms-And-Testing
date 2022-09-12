package hashtables;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {

        int half = candyType.length / 2;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : candyType) {
            if (!map.containsKey(i)) {
                map.put(i, 1);
            } else {
                map.replace(i, map.get(i + 1));
            }
        }

        if (map.size() == half) {
            return half;
        } else {
            for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
                if (count != half) {
                    count++;
                }
            }
        }

        return count;
    }
}
