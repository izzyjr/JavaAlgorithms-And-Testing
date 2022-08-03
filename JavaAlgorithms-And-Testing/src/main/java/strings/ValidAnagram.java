package strings;

public class ValidAnagram {

    public static Boolean validAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    StringBuilder change = new StringBuilder(t);
                    change.setCharAt(j, '*');
                    t = change.toString();
                    break;
                }
            }
        }

        return count == length;
    }
}
