package hashtables;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        Map<Integer, Integer> hashMapNums = new HashMap<>();

        for (int num : nums) {
            if (!hashMapNums.containsKey(num)) {
                hashMapNums.put(num, 1);
            } else {
                return true;
            }
        }

        return false;
    }
}
