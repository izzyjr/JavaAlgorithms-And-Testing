package strings;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        int length = s.length();
        StringBuilder substring = new StringBuilder();

        for (int i = 0; i < length; i++) {

            substring.append(s.charAt(i));
            StringBuilder appended = new StringBuilder();
            int count = 0;

            while (count < length/substring.length()) {
                appended.append(substring);
                count++;
            }

            if (s.equals(appended.toString()) && i != length - 1) {
                return true;
            }
        }

        return false;
    }
}