package hashtables;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static int longestPalindrome(String s) {

        int length = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (map.containsKey(s.charAt(i))) {
                map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }

        int count = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                count += entry.getValue();
            }
        }

        return count + 1;
    }
}
