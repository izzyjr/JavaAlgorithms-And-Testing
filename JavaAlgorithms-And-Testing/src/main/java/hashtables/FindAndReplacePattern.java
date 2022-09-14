package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FindAndReplacePattern {

    public static String[] findAndReplacePattern(String[] words, String pattern) {

        String[] result = new String[10];
        String keys = "";

        for (String word : words) {

            Map<Character, Character> map = new HashMap<>();
            boolean flag = true;

            for (int j = 0; j < word.length(); j++) {
                if (!map.containsKey(pattern.charAt(j)) && !map.containsValue(word.charAt(j))) {
                    map.put(pattern.charAt(j), word.charAt(j));
                } else if (map.get(pattern.charAt(j)) != word.charAt(j)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {

            }
        }

        return result;
    }
}
