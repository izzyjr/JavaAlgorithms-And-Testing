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

        int length = s.length();
        int vowels = 0;
        int consonants = 0;
        int mixed = 0;

        for (int i = 0; i < length; i++) {

            if (vowelsMap.containsKey(s.charAt(i))) {
                vowels++;
                consonants = 0;
            } else if (s.charAt(i) == '?') {
                mixed++;
                vowels++;
                consonants++;
            } else {
                consonants++;
                vowels = 0;
            }

            if (consonants == 0 && vowels == 1 || consonants == 1 && vowels == 0) {
                mixed = 0;
            }

            if (vowels > 2 && mixed > 0 || consonants > 4 && mixed > 0) {
                return "mixed";
            } else if (vowels == 3 || consonants == 5) {
                return "bad";
            }
        }

        return "good";
    }
}
