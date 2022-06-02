import java.util.Arrays;

public class AreSimilar {

    public static boolean areSimilar(int[] a, int[] b) {

        if (Arrays.equals(a, b)) {
            return true;
        }

        int length = a.length;
        int nonMatching = 0;
        int[] nonMatchingInts = new int[4];
        int j = -1;

        for (int i = 0; i < length; i++) {
            if (a[i] != b[i]) {
                nonMatching++;
                if (nonMatching <= 2) {
                    j++;
                    nonMatchingInts[j] = a[i];
                    j++;
                    nonMatchingInts[j] = b[i];
                }
            }
            if (nonMatching > 2) {
                return false;
            }
        }
        return nonMatchingInts[0] == nonMatchingInts[3] && nonMatchingInts[1] == nonMatchingInts[2];
    }
}
