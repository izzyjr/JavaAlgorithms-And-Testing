package hashtables;

import java.util.ArrayList;
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
                    map.put(dishes[rows][cols], new ArrayList<>(List.of(dish)));
                }
            }
            firstItemInRow++;
        }

        printHashtable(map);

        return dishes;
    }

    public static void printHashtable(Map<String, List<String>> map) {
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            for (String s : entry.getValue()) {
                System.out.println(entry.getKey() + " - " + s);
            }
        }
    }
}
