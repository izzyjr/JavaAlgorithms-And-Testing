import java.util.Arrays;

public class MakeArrayConsecutive2 {

    public static int makeArrayConsecutive2 (int[] statues) {

        insertionSort(statues);
        int count = 0;
        for (int i = 0; i < statues.length - 1; i++) {
            if (statues[i] + 1 != statues[i + 1]) {
                count += (statues[i + 1] - statues[i]) - 1;
            }
        }
        return count;
    }

    private static void insertionSort(int[] array) {

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int i;
            for (i = firstUnsortedIndex; i > 0 && array[i - 1] > newElement; i--) {
                array[i] = array[i - 1];
            }
            array[i] = newElement;
        }
    }

    // first attempt from way back
    public static int makeArrayConsecutiveTwo0(int[] statues) {
        if (statues.length == 1) {
            return 0;
        }
        int largestNum = statues[0];
        int smallestNum = statues[0];
        for (int i = 0; i < statues.length; i++) {
            if (largestNum <= statues[i]) {
                largestNum = statues[i];
            }
            if (smallestNum >= statues[i]) {
                smallestNum = statues[i];
            }
        }

        int countUp = smallestNum;
        int there = 0;
        for (int j = 0; j < largestNum; j++) {
            countUp++;
            for (int k = 0; k < statues.length; k++) {
                if (countUp < largestNum) {
                    if (countUp == statues[k]) {
                        there++;
                    }
                }
            }
        }
        int count = (largestNum - (smallestNum + 1)) - there;
        return count;
    }
}
