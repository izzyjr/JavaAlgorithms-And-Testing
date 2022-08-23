package hashtables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CountPoints {

    public static int countPoints(String rings) {

        int result = 0;
        int length = rings.length();
        Map<Character, HashSet<Character>> map = new HashMap<>();
        char color = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                color = rings.charAt(i);
            } else {
                if (!map.containsKey(rings.charAt(i))) {
                    map.put(rings.charAt(i), new HashSet<>());
                    map.get(rings.charAt(i)).add(color);
                } else {
                    map.get(rings.charAt(i)).add(color);
                }
            }
        }

        for (HashSet<Character> set : map.values()) {
            if (set.size() == 3) {
                result++;
            }
        }

        return result;
    }
}
