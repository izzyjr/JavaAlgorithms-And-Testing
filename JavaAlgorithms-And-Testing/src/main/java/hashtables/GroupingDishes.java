package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupingDishes {

    public static String[][] groupingDishes(String[][] dishes) {

        int rowsLength = dishes.length;
        int firstItemInRow = 0;
        String dish = null;

        Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        for (int rows = 0; rows < rowsLength; rows++) {
            for (int cols = 0; cols < dishes[rows].length; cols++) {
                if (rows == firstItemInRow && cols == 0) {
                    dish = dishes[rows][cols];
                } else {
                    if (map.get(dishes[rows][cols]) == null) {
                        map.put(dishes[rows][cols], new ArrayList<>(List.of(dish)));
                    } else {
                        map.get(dishes[rows][cols]).add(dish);
                    }
                }
            }
            firstItemInRow++;
        }

        printHashtable(map);

        int arrSize = 0;
        Map<String, Integer> keysAndSize = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().size() >= 2) {
                arrSize++;
                keysAndSize.put(entry.getKey(), entry.getValue().size());
            }
        }

        String[][] result = new String[arrSize][];
        int j = arrSize - 1;

        for (Map.Entry<String, Integer> entry : keysAndSize.entrySet()) {
            System.out.println(entry.getKey() + " - " + j);
            int size = entry.getValue();
            for (int i = 0; i < size; i++) {
                result[j] = new String[size + 1];
                if (i == 0) {
                    result[j][i] = entry.getKey();
                    System.out.println("if key: " + result[j][i]);
                }
                result[j][i] = map.get(entry.getKey()).get(i);
                System.out.println("if not key: " + result[j][i]);
            }
            j--;
        }

        return result;
    }

    public static void printHashtable(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                System.out.println(entry.getKey() + " - " + s);
            }
        }
    }
}
