package hashtables;

import java.util.HashMap;
import java.util.Map;

public class NextGreaterElement {

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums2.length; i++) {
            map.put(i, nums2[i]);
        }

        System.out.println(map);

        return result;
    }
}
