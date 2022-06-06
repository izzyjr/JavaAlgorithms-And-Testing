package hashtables;

import java.util.*;

public class ContainsCloseNums {

    public static boolean containsCloseNums(int[] nums, int k) {

        int length = nums.length;
        Map<Integer, List<Integer>> hashMapNums = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (!hashMapNums.containsKey(nums[i])) {
                hashMapNums.put(nums[i], new ArrayList<>(List.of(i)));
            } else {
                hashMapNums.get(nums[i]).add(i);
            }
        }

        int absoluteDifference = 0;

        for (List<Integer> listNums : hashMapNums.values()) {
            if (listNums.size() > 1) {
                for (int i = 0; i < listNums.size(); i++) {
                    if ((i + 1) < listNums.size()) {
                        if (listNums.get(i) <= listNums.get(i + 1)) {
                            absoluteDifference = listNums.get(i + 1) - listNums.get(i);
                        } else {
                            absoluteDifference = listNums.get(i) - listNums.get(i - 1);
                        }
                    }
                    if (absoluteDifference == k || absoluteDifference == 1) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
