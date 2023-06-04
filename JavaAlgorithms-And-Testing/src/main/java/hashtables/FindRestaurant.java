package hashtables;

import java.util.*;

public class FindRestaurant {

    public static List<String> findRestaurant(String[] list1, String[] list2) {

        Map<Integer, Integer> map = new HashMap<>();
        int least = (list1.length + list2.length) - 2;

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (Objects.equals(list1[i], list2[j])) {
                    map.put(i, j);
                    if (i + j < least) {
                        least = i + j;
                    }
                }
            }
        }

        List<String> result = new ArrayList<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() + entry.getValue() <= least) {
                least = entry.getKey() + entry.getValue();
                result.add(list1[entry.getKey()]);
            }
        }

        return result;
    }
}
