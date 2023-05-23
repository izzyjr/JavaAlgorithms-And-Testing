package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {

    public static int firstUniqueChar(String s) {

        Map<Character, Integer> hashMapChars = new HashMap<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (!hashMapChars.containsKey(s.charAt(i))) {
                for (int j = i + 1; j < length; j++) {
                    if (s.charAt(i) == s.charAt(j)) {
                        hashMapChars.put(s.charAt(i), 1);
                        break;
                    }
                }
            }
            if (!hashMapChars.containsKey(s.charAt(i))) {
                return i;
            }
        }

        return -1;
    }
}
