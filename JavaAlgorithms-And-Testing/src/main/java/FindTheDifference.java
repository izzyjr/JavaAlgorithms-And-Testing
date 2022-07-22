import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        
        int tLength = t.length();
        int sLength = s.length();
        char result = 0;
        Map<Character, Integer> map = new HashMap<>();


        for (int i = 0; i < tLength; i++) {
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 1);
            } else {
                map.replace(t.charAt(i), map.get(t.charAt(i)) + 1);
            }
        }

        for (int j = 0; j < sLength; j++) {
            if (map.containsKey(s.charAt(j))) {
                if (map.get(s.charAt(j)) != 0) {
                    map.replace(s.charAt(j), map.get(s.charAt(j)) - 1);
                    if (map.get(s.charAt(j)) == 0) {
                        map.remove(s.charAt(j));
                    }
                }
            }
        }

        for (Character key : map.keySet()) {
            result = key;
        }

        return result;
    }
}
