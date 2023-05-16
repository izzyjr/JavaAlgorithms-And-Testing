package arrays;

import java.util.Arrays;

public class ShortestToChar {

    public static int[] shortestToChar(String s, char c) {

        int[] distances = new int[s.length()];
        int x = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                for (int j = x; j < s.length(); j++) {
                    System.out.println(i + "-" + j + "=" + (i - j));
                    distances[j] = i - j;
                    if (j == i) {
                        x = i + 1;
                        break;
                    }
                }
                System.out.println(Arrays.toString(distances));
            }
        }

        return distances;
    }
}
