import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        
        int tLength = t.length();
        int sLength = s.length();
        char result = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < sLength; i++) {
            map.put(s.charAt(i), 1);
        }

        for (int j = 0; j < tLength; j++) {
            if (!map.containsKey(t.charAt(j))) {
                result = t.charAt(j);
                break;
            }
        }

        return result;
    }
}
