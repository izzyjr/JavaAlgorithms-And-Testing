package arrays;

import java.util.Arrays;

public class ShortestToChar {

    public static int[] shortestToChar(String s, char c) {

        int[] distances = new int[s.length()];
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                for (int j = 0; j < s.length(); j++) {
                    if (count > 1) {
                        if (distances[j] > Math.abs(i - j)) {
                            distances[j] = Math.abs(i - j);
                        }
                    } else {
                        distances[j] = Math.abs(i - j);
                    }
                }
            }
        }

        return distances;
    }
}
