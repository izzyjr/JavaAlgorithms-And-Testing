package hashtables;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class FindAndReplacePattern {

    public static String[] findAndReplacePattern(String[] words, String pattern) {

        StringBuilder keys = new StringBuilder();
        int length = words.length;

        for (int i = 0; i < length; i++) {

            Map<Character, Character> map = new HashMap<>();
            boolean flag = true;

            for (int j = 0; j < pattern.length(); j++) {
                if (!map.containsKey(pattern.charAt(j)) && !map.containsValue(words[i].charAt(j))) {
                    map.put(pattern.charAt(j), words[i].charAt(j));
                } else if (!Objects.equals(map.get(pattern.charAt(j)), words[i].charAt(j))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                keys.append(i);
            }
        }

        int keysLength = keys.length();
        String[] result = new String[keysLength];

        for (int k = 0; k < keysLength; k++) {
            result[k] = words[Integer.parseInt(String.valueOf(keys.charAt(k)))];
        }

        return result;
    }
}
