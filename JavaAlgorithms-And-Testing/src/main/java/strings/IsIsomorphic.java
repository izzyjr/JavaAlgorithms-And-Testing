package strings;

import java.util.HashMap;
import java.util.Map;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();
        int length = s.length();

        for (int i = 0; i < length; i++) {

            if (!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

            if (map.containsValue(t.charAt(i))) {
                for (Map.Entry<Character, Character> entry: map.entrySet()) {
                    if (entry.getValue() == t.charAt(i)) {
                        if (entry.getKey() != s.charAt(i)) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
