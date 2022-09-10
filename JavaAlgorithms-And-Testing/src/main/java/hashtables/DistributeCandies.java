package hashtables;

import java.util.HashMap;
import java.util.Map;

public class DistributeCandies {

    public static int distributeCandies(int[] candyType) {

        int length = candyType.length;
        int half = length / 2;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i : candyType) {
            if (count != half) {
                if (!map.containsKey(i)) {
                    map.put(i, 1);
                } else {
                    map.replace(i, map.get(i + 1));
                }
            }
            count++;
        }

        return map.size();
    }
}
