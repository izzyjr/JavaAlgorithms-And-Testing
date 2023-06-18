package arrays;

import java.util.HashMap;
import java.util.Map;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        Map<Integer, Integer> map = new HashMap<>();
        int spaces = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 1) {
                if (i % 2 == 0) {
                    for (int j = 0; j < flowerbed.length; j++) {
                        if (flowerbed[j] == 1) {
                            spaces++;
                        }
                        if (j % 2 == 0) {
                            map.put(1, map.getOrDefault(1, 0) + 1);
                        } else {
                            map.put(0, map.getOrDefault(0, 0) + 1);
                        }
                    }
                } else {
                    for (int j = 0; j < flowerbed.length; j++) {
                        if (flowerbed[j] == 1) {
                            spaces++;
                        }
                        if (j % 2 != 0) {
                            map.put(0, map.getOrDefault(0, 0) + 1);
                        } else {
                            map.put(1, map.getOrDefault(1, 0) + 1);
                        }
                    }
                }
                break;
            }
        }

        if (map.isEmpty()) {
            return (flowerbed.length / 2) + 1 >= n;
        }

        return map.get(1) - spaces >= n;
    }
}