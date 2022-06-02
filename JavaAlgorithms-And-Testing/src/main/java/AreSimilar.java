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
            if (a[i] != b[i]) {
                negCount++;
                int search = -1;
                while (++search < length) {
                    if (b[i] == a[search]) {
                        count++;
                        break;
                    }
                }
            } else {
                count++;
            }
        }
        return length == count && negCount <=2;
    }
}
