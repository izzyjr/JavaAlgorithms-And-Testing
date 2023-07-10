package arrays;

import sort.Sort;

public class HeightChecker {

    public static int heightChecker(int[] heights) {

        int[] sortedClone = heights.clone();
        Sort.insertionSort(sortedClone);
        int result = 0;

        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != sortedClone[i]) {
                result++;
            }
        }

        return result;
    }
}
