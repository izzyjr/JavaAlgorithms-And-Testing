package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountPoints {

    public static int countPoints(String rings) {

        int result = 0;
        int length = rings.length();
        Map<Character, ArrayList<Character>> map = new HashMap<>();
        char color = 0;

        for (int i = 0; i < length; i++) {
            if (i % 2 != 0) {
                color = rings.charAt(i);
            } else {
                if (!map.containsKey(rings.charAt(i))) {
                    map.put(rings.charAt(i), new ArrayList<>(List.of(color)));
                } else {
                    map.get(rings.charAt(i)).add(color);
                }
            }
        }

        for (List<Character> list : map.values()) {
            if (list.size() >= 3) {
                result++;
            }
        }

        return result;
    }
}
