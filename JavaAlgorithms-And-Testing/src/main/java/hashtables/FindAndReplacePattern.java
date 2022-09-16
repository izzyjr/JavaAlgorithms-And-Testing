package hashtables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class FindAndReplacePattern {

    public static List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> followsPatternWords = new ArrayList<>();

        for (String word : words) {

            Map<Character, Character> map = new HashMap<>();
            boolean followsPattern = true;

            for (int j = 0; j < pattern.length(); j++) {
                if (!map.containsKey(pattern.charAt(j)) && !map.containsValue(word.charAt(j))) {
                    map.put(pattern.charAt(j), word.charAt(j));
                } else if (!Objects.equals(map.get(pattern.charAt(j)), word.charAt(j))) {
                    followsPattern = false;
                    break;
                }
            }
            if (followsPattern) {
                followsPatternWords.add(word);
            }
        }

        return followsPatternWords;
    }
}
