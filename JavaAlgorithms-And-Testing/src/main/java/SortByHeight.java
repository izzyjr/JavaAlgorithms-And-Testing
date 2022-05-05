public class SortByHeight {

    public static int[] sortByHeight(int[] array) {

        int temp;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != -1 && array[j] != -1) {
                    if (array[i] < array[j]) {
                        temp = array[j];
                        array[j] = array[i];
                        array[i] = temp;
                    }
                }
            }
        }
        return array;
    }
}
