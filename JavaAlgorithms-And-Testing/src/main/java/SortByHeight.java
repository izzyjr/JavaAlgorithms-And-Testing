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

    // first attempt solution
    public static int[] sortByHeight0(int[] a) {

        int temp;
        int increase = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (j < (a.length - 1)) {
                    if (a[j + 1] == -1) {
                        while (a[j + increase] == -1 && (j + increase) < (a.length - 1)) {
                            increase++;
                        }
                        if (a[j] > a[j + increase] && a[j + increase] != -1) {
                            temp = a[j + increase];
                            a[j + increase] = a[j];
                            a[j] = temp;
                        }
                    } else  {
                        if (a[j] > a[j + 1]) {
                            temp = a[j + 1];
                            a[j + 1] = a[j];
                            a[j] = temp;
                        }
                    }
                }
                increase = 1;
            }
        }

        return a;
    }
}
