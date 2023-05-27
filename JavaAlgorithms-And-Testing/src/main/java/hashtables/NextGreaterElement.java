package hashtables;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int length = nums2.length;
        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            map.put(nums2[i], i);
        }

        for (int j = 0; j < nums1.length; j++) {
            int greater = nums1[j];
            int start = map.get(nums1[j]) + 1;
            for (int x = start; x < length; x++) {
                if (greater < nums2[x]) {
                    result[j] = nums2[x];
                    greater = nums2[x];
                    break;
                }
            }
            if (greater == nums1[j]) {
                result[j] = -1;
            }
        }

        return result;
    }
}
