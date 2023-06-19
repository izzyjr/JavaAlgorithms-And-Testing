package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindJudge {

    public static int findJudge(int n, int[][] trust) {

        Map<Integer, Map<Integer, Integer>> mostTrusted = new HashMap<>();

        for (int[] trusted : trust) {
            if (mostTrusted.containsKey(trusted[1])) {
                mostTrusted.get(trusted[1]).put(trusted[0], 1);
            } else {
                mostTrusted.put(trusted[1], new HashMap<>());
                mostTrusted.get(trusted[1]).put(trusted[0], 1);
            }
        }

        for (Map.Entry<Integer, Map<Integer, Integer>> entry : mostTrusted.entrySet()) {
            if (entry.getValue().size() == n - 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}
