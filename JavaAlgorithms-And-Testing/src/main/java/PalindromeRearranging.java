import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    public static boolean palindromeRearranging(String inputString) {

        int length = inputString.length();
        Map<String, Integer> repeats = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String key = String.valueOf(inputString.charAt(i));
            if (!repeats.containsKey(key)) {
                repeats.put(key, 1);
            } else {
                repeats.put(key, repeats.get(key) + 1);
            }
        }

        int count = 0;

        for (Integer repeated : repeats.values()) {
            if (repeated % 2 != 0) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    }
}
