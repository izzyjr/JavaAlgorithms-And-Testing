package arrays;

import java.util.TreeMap;

public class ThirdMax {

    public static int thirdMax(int[] nums) {

        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int num : nums) {
            if (!tree.containsKey(num)) {
                tree.put(num, 1);
            }
        }

        int size = tree.size();
        int count = 0;

        if (size >= 3) {
            for (int num : tree.keySet()) {
                if (size - count == 3) {
                    return num;
                } else {
                    count++;
                }
            }
        }

        return tree.lastEntry().getKey();
    }
}
