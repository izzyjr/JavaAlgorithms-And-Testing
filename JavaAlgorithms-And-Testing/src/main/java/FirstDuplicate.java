public class FirstDuplicate {

    public static int firstDuplicate(int[] a) {

        int lowestIndex = a.length - 1;
        int lowest = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] == a[j] && i < j) {
                    if (lowestIndex >= j) {
                        lowestIndex = j;
                        lowest = a[lowestIndex];
                    }
                }
            }
        }
        if (lowest == 0) {
            return -1;
        }
        return lowest;
    }
}
