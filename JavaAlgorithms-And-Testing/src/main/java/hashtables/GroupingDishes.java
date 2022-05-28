package hashtables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupingDishes {

    public static String[][] groupingDishes(String[][] dishes) {

        int rowsLength = dishes.length;
        int firstItemInRow = 0;
        String dish = null;

        Map<String, List<String>> ingredientAndDishes = new LinkedHashMap<>();
        for (int rows = 0; rows < rowsLength; rows++) {
            for (int cols = 0; cols < dishes[rows].length; cols++) {
                if (rows == firstItemInRow && cols == 0) {
                    dish = dishes[rows][cols];
                } else {
                    if (ingredientAndDishes.get(dishes[rows][cols]) == null) {
                        ingredientAndDishes.put(dishes[rows][cols], new ArrayList<>(List.of(dish)));
                    } else {
                        ingredientAndDishes.get(dishes[rows][cols]).add(dish);
                    }
                }
            }
            firstItemInRow++;
        }

        int arrSize = 0;
        Map<String, Integer> keysAndSize = new HashMap<>();

        for (Map.Entry<String, List<String>> entry : ingredientAndDishes.entrySet()) {
            if (entry.getValue().size() >= 2) {
                arrSize++;
                keysAndSize.put(entry.getKey(), entry.getValue().size());
            }
        }

        String[][] result = new String[arrSize][];
        int j = 0;
        ArrayList<String> sortedKeys = new ArrayList<String>(keysAndSize.keySet());
        Collections.sort(sortedKeys);

        for (String key : sortedKeys) {
            int size = keysAndSize.get(key);
            ingredientAndDishes.get(key).sort(Comparator.naturalOrder());
            result[j] = new String[size + 1];
            for (int i = 0; i < size; i++) {
                if (i == 0) {
                    result[j][i] = key;
                }
                result[j][i + 1] = ingredientAndDishes.get(key).get(i);
            }
            j++;
        }

        return result;
    }
}
