package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindRestaurant {

    public static List<String> findRestaurant(String[] list1, String[] list2) {

        Map<String, Integer> map = new HashMap<>();
        int least = (list1.length + list2.length) - 2;

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                if (j + map.get(list2[j]) < least) {
                    result.clear();
                    result.add(list2[j]);
                    least = j + map.get(list2[j]);
                } else if (j + map.get(list2[j]) == least) {
                    result.add(list2[j]);
                }
            }
        }

        System.out.println(result);

        return result;
    }
}
