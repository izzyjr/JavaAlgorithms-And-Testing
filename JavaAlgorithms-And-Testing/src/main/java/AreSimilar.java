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

    // first attempt solution
    public static boolean areSimilar0(int[] a, int[] b) {

        int sumA = 0;
        int sumB = 0;
        int sameCounter = 0;
        int parallelCounter = 0;
        int arrayLength = a.length;

        for (int i = 0; i < arrayLength; i++) {
            sumA += a[i];
            sumB += b[i];
            if (a[i] != b[i]) {
                parallelCounter++;
            }
            for (int j = 0; j < arrayLength; j++) {
                if (a[i] == b[j]) {
                    sameCounter++;
                    j = arrayLength;
                }
            }
        }
        if (sameCounter == arrayLength && parallelCounter <= 2 && sumA == sumB) {
            return true;
        }
        return false;
    }
}
