package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappeared = new ArrayList<>();

        for (int i = 1; i < nums.length + 1; i++) {
            boolean present = false;
            for (int num : nums) {
                if (i == num) {
                    present = true;
                    break;
                }
            }
            if (!present) {
                disappeared.add(i);
            }
        }

        return disappeared;
    }
}
