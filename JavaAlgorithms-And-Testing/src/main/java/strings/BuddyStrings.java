package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;
        int first = 0;
        int second = 0;

        if (length != goal.length()) {
            return false;
        }

        if (!s.equals(goal)) {
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) != goal.charAt(i)) {
                    if (first == 0) {
                        first = i;
                    } else if (second == 0) {
                        second = i;
                    } else {
                        return false;
                    }
                }
            }
        } else {
            int[] counter = new int[26];
            for (int i = 0; i < s.length(); i++) {
                counter[s.charAt(i) - 'a']++;
            }

            for (int c: counter)  {
                if (c > 1) {
                    return true;
                }
            }
            return false;
        }

        return s.charAt(first) == goal.charAt(second) && s.charAt(second) == goal.charAt(first);
    }
}
