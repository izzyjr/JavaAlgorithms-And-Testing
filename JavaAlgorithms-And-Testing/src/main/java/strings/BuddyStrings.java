package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        boolean equals = s.charAt(0) == s.charAt(1);
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                count++;
            }
        }

        if (count == 0) {
            return equals;
        }

        return count == 2;
    }
}
