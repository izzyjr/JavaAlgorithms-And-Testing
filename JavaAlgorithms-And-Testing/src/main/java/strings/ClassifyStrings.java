package strings;

import java.util.HashMap;
import java.util.Map;

public class ClassifyStrings {

    public static String classifyStrings(String s) {

        Map<Character, Character> vowelsMap = new HashMap<>();
        vowelsMap.put('a', 'a');
        vowelsMap.put('e', 'e');
        vowelsMap.put('i', 'i');
        vowelsMap.put('o', 'o');
        vowelsMap.put('u', 'u');

        if (s.contains("?")) {
            String vowel = classify(s, vowelsMap, 'a');
            String cons = classify(s, vowelsMap, 'b');
            if (!vowel.equals(cons)) {
                return "mixed";
            } else {
                return vowel;
            }
        }

        return classify(s, vowelsMap);
    }

    private static String classify(String s, Map<Character, Character> map) {

        return shared(s, map);
    }

    private static String classify(String s, Map<Character, Character> map, char x) {

        s = s.replace('?', x);

        return shared(s, map);
    }

    private static String shared(String s, Map<Character, Character> map) {

        int length = s.length();
        int vowels = 0;
        int consonants = 0;
        int mixed = 0;

        for (int i = 0; i < length; i++) {

            if (map.containsKey(s.charAt(i))) {
                vowels++;
                consonants = 0;
            } else {
                consonants++;
                vowels = 0;
            }

            if (vowels == 3 || consonants == 5) {
                return "bad";
            }
        }

        return "good";
    }
}
