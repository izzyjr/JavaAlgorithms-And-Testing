package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        ArrayList<String> words = new ArrayList<>();
        String word = "";
        int sLength = s.length();

        for (int i = 0; i < sLength; i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                words.add(word);
                word = "";
            }
        }

        words.add(word);

        if (words.size() != pattern.length()) {
            return false;
        }

        int patternLength = pattern.length();
        Map<Character, String> map = new HashMap<>();

        for (int j = 0; j < patternLength; j++) {
            if (map.containsKey(pattern.charAt(j)) || map.containsValue(words.get(j))) {
                if (!Objects.equals(map.get(pattern.charAt(j)), words.get(j))) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(j), words.get(j));
            }
        }

        return true;
    }
}
