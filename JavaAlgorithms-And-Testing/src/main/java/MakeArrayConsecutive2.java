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
}
