package strings;

import java.util.HashMap;
import java.util.Map;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        StringBuilder string = new StringBuilder(s);
        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                map.put(i, goal.charAt(i));
            }
        }

        System.out.println(map.size());

        for (Map.Entry<Integer, Character> entry : map.entrySet()) {
            string.setCharAt(entry.getKey(), entry.getValue());
        }

        return string.toString().equals(goal);
    }
}
