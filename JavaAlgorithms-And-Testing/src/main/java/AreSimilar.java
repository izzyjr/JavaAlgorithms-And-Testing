import java.util.Arrays;

public class AreSimilar {

    public static boolean areSimilar(int[] a, int[] b) {

        if (Arrays.equals(a, b)) {
            return true;
        }

        int length = a.length;
        int count = 0;
        int negCount = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (i == j && b[i] != a[j]) {
                    negCount++;
                }
                if (b[i] == a[j]) {
                    count++;
                }
            }
        }

        return count == length && negCount <= 2;
    }
}
