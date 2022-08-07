package strings;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        int length = s.length();

        if (length == 1) {
            return false;
        } else if (length % 2 != 0) {

            for (int i = 1; i < length; i++) {
                if (s.charAt(0) != s.charAt(i)) {
                    return false;
                }
            }

            return true;
        } else {

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
        }

        return false;
    }
}