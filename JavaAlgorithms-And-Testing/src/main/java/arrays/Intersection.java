package arrays;

import java.util.ArrayList;

public class Intersection {

    public static int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> unique = new ArrayList<>();
        int count = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                    unique.add(nums1[i]);
                    int temp = nums1[i];
                    nums2[j] = -1;
                    for (int l = j + 1; l < nums2.length; l++) {
                        if (temp == nums2[l]) {
                            nums2[l] = -1;
                        }
                    }
                    break;
                }
            }
        }

        int[] result = new int[count];

        for (int i = 0; i < result.length; i++) {
            result[i] = unique.get(i);
        }

        return result;
    }
}
