package strings;

public class StrStr {

    public static int strStr(String s, String x) {

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == x.charAt(0)) {

                if ((s.length() - i) < x.length()) {
                    return -1;
                }

                int count = 0;
                int iterator = i;
                for (int j = 1; j < x.length(); j++) {
                    if (x.charAt(j) != s.charAt(++iterator)) {
                        break;
                    }
                    count = j;
                }

                if (count == x.length() - 1) {
                    return i;
                }
            }
        }

        return -1;
    }
}
