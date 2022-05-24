import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {

    public static boolean sumOfTwo(int[] a, int[] b, int v) {

        Map<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < a.length; i++) {
            hashMap.put(v - a[i], i);
        }

        for (int j = 0; j < b.length; j++) {
            if (hashMap.containsKey(b[j])) {
                return true;
            }
        }
        return false;
    }
}
