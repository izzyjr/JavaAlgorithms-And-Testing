package strings;

public class StrStr {

    public static int strStr(String s, String x) {

        for (int i = 0; i < s.length(); i++) {

            if ((s.length() - i) - x.length() == -1) {
                return -1;
            }

            if (s.charAt(i) == x.charAt(0)) {
                int count = 1;
                int iterator = i;
                for (int j = 1; j < x.length(); j++) {
                    if (++iterator < s.length()) {
                        if (x.charAt(j) == s.charAt(iterator)) {
                            count++;
                        } else {
                            j = x.length();
                        }
                    }
                }

                if (count == x.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}