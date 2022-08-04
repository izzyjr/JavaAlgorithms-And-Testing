import java.util.HashMap;
import java.util.Map;

public class NumberOfCharactersString {

    public static String numberOfCharactersString(String str) {

        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), 1);
            } else {
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        StringBuilder result = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            result.append(entry.getKey()).append(entry.getValue());
        }

        return result.toString();
    }

}
