package strings;

public class BuddyStrings {

    public static boolean buddyStrings(String s, String goal) {

        int length = s.length();
        int count = 0;

        if (!s.equals(goal)) {
            for (int i = 0; i < length; i++) {
                if (s.charAt(i) != goal.charAt(i) && goal.contains(Character.toString(s.charAt(i)))) {
                    count++;
                }
            }
        } else {

        }

        System.out.println("count: " + count);

        return count == 2;
    }
}
