package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;
        int same = 0;

        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != goal.charAt(i) && goal.contains(Character.toString(s.charAt(i)))) {
                count++;
            }
            if (i != 0) {
                if (s.charAt(i - 1) == s.charAt(i)) {
                    same++;
                }
            }
        }

        System.out.println("count: " + count);
        System.out.println("same: " + same);

        if (count == 2 && same == 0) {
            return true;
        } else if (count == 2 && same == length - 1) {
            return true;
        }
        return same > count;
    }
}
