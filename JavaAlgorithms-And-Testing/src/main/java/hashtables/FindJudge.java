package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindJudge {

    public static int findJudge(int n, int[][] trust) {

        Map<Integer, Map<Integer, Integer>> trusted = new HashMap<>();
        Map<Integer, Integer> trusters = new HashMap<>();

        for (int[] relationship : trust) {
            if (trusted.containsKey(relationship[1])) {
                trusted.get(relationship[1]).put(relationship[0], 1);
            } else {
                trusted.put(relationship[1], new HashMap<>());
                trusted.get(relationship[1]).put(relationship[0], 1);
            }
            if (!trusters.containsKey(relationship[0])) {
                trusters.put(relationship[0], 1);
            }
        }

        int mostTrusted = 0;
        for (Map.Entry<Integer, Map<Integer, Integer>> entry : trusted.entrySet()) {
            if (entry.getValue().size() == n - 1) {
                mostTrusted = entry.getKey();
            }
        }

        if (mostTrusted != 0) {
            if (trusted.get(mostTrusted).size() == (n - 1) && !trusters.containsKey(mostTrusted)) {
                return mostTrusted;
            }
        } else {
            if (n == 1) {
                return n;
            }
        }

        return -1;
    }
}
