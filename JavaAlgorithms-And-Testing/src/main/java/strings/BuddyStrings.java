package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;

        if (!s.equals(goal)) {
            for (int i = 0; i < length; i++) {
                boolean contains = goal.contains(Character.toString(s.charAt(i)));
                if (i != length - 1 && s.charAt(i) != s.charAt(i + 1)) {
                    if (s.charAt(i) != goal.charAt(i) && contains) {
                        count++;
                    }
                } else if (i == length - 1) {
                    if (s.charAt(i) != goal.charAt(i) && contains) {
                        count++;
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

        return count == 2;
    }
}
