package hashtables;

import java.util.*;

public class ContainsCloseNums {

    public static boolean containsCloseNums(int[] nums, int k) {

        int length = nums.length;
        Map<Integer, List<Integer>> numsMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (!numsMap.containsKey(nums[i])) {
                numsMap.put(nums[i], new ArrayList<>(List.of(i)));
            } else {
                numsMap.get(nums[i]).add(i);
            }
        }

        int absoluteDifference = 0;

        for (List<Integer> listNums : numsMap.values()) {
            if (listNums.size() > 1) {
                for (int i = 0; i < listNums.size(); i++) {
                    if ((i + 1) < listNums.size()) {
                        if (listNums.get(i) <= listNums.get(i + 1)) {
                            absoluteDifference = listNums.get(i + 1) - listNums.get(i);
                        } else {
                            absoluteDifference = listNums.get(i) - listNums.get(i - 1);
                        }
                    }
                    if (absoluteDifference == k) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
