package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }

        return count == 2;
    }
}
