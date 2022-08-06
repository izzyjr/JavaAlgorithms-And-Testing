package strings;

public class RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {

        int length = s.length();
        int half = length / 2;
        StringBuilder firstHalf = new StringBuilder();
        StringBuilder secondHalf = new StringBuilder();

        if (length == 1) {
            return false;
        } else if (length % 2 != 0) {
            for (int i = 1; i < length; i++) {
                if (s.charAt(0) != s.charAt(i)) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < length; i++) {
                if (i < half) {
                    firstHalf.append(s.charAt(i));
                } else {
                    secondHalf.append(s.charAt(i));
                }
            }
        }

        return firstHalf.toString().equals(secondHalf.toString());
    }
}