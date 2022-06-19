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
        vowelsMap.put('?', '?');

        int length = s.length();
        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < length; i++) {
            if (vowelsMap.containsKey(s.charAt(i))) {
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
