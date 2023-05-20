package arrays;

import sort.Sort;

public class Merge {

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {

        for (int i = nums1.length - 1; i >= m; i--) {
            nums1[i] = nums2[n - 1];
            n--;
        }

        Sort.insertionSort(nums1);

        return nums1;
    }
}
