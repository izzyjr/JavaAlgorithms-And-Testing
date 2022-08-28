package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
            if (i != 0) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    count++;
                }
            }
        }

        return count > 0 && count <= 2;
    }
}
