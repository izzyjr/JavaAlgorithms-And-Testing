public class SumOfTwo {

    public static boolean sumOfTwo(int[] a, int[] b, int v) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] + b[j] == v) {
                    return true;
                }
            }
        }
        return false;
    }
}
