package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindJudge {

    public static int findJudge(int n, int[][] trust) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int[] trusted : trust) {
            map.put(trusted[1], map.getOrDefault(trusted[1], 0) + 1);
        }

        System.out.println(map);

        int trustedCount = 0;
        int mostTrusted = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (trustedCount < entry.getValue()) {
                trustedCount = entry.getValue();
                mostTrusted = entry.getKey();
            }
        }

        System.out.println("trustedCount: " + trustedCount);

        if (mostTrusted == n) {
            return n;
        }
        return -1;
    }
}
