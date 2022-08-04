package strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static Boolean validAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int length = s.length();
        Map<Character, Integer> mapS = new HashMap<>();
        Map<Character, Integer> mapT = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (!mapS.containsKey(s.charAt(i))) {
                mapS.put(s.charAt(i), 1);
            } else {
                mapS.replace(s.charAt(i), mapS.get(s.charAt(i)) + 1);
            }

            if (!mapT.containsKey(t.charAt(i))) {
                mapT.put(t.charAt(i), 1);
            } else {
                mapT.replace(t.charAt(i), mapT.get(t.charAt(i)) + 1);
            }
        }

        return mapS.equals(mapT);
    }
}
