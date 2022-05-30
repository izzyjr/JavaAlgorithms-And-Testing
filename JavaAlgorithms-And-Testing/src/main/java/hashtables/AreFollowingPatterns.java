package hashtables;

import java.util.HashMap;
import java.util.Map;

public class AreFollowingPatterns {

    public static boolean areFollowingPatterns(String[] strings, String[] patterns) {

        Map<String, String> hashMap = new HashMap<>();

        for (int i = 0; i < strings.length; i++) {
            if (!hashMap.containsKey(patterns[i])) {
                hashMap.put(patterns[i], strings[i]);
            } else if (hashMap.get(patterns[i]) != strings[i]) {
                return false;
            }
        }
        return true;
    }
}
