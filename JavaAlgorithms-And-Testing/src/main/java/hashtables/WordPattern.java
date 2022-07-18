package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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

        int patternLength = pattern.length();
        Map<String, Character> map = new HashMap<>();

        for (int j = 0; j < patternLength; j++) {
            if (map.containsKey(words.get(j))) {
                if (map.get(words.get(j)) != pattern.charAt(j)) {
                    return false;
                }
            } else {
                map.put(words.get(j), pattern.charAt(j));
            }
        }

        return true;
    }
}
