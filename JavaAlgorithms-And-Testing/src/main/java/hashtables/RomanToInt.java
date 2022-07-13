package hashtables;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static int romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'I' || s.charAt(i) == 'X' || s.charAt(i) == 'C') {
                if (i + 1 < s.length()) {
                    if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X') {
                        result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                        i++;
                    } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C') {
                        result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                        i++;
                    } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M') {
                        result += map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
                        i++;
                    } else {
                        result += map.get(s.charAt(i));
                    }
                } else {
                    result += map.get(s.charAt(i));
                }
            } else {
                result += map.get(s.charAt(i));
            }
        }

        return result;
    }
}
