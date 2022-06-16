package strings;

public class StrStr {

    public static int strStr(String s, String x) {

        int sLength = s.length();
        int xLength = x.length();

        for (int i = 0; i < sLength; i++) {

            if ((sLength - i) < xLength) {
                return -1;
            }

            if (s.charAt(i) == x.charAt(0) && s.charAt(i + xLength - 1) == x.charAt(xLength - 1)) {

                if (xLength == 1) {
                    return i;
                }

                int count = 2;
                int iterator = i;
                for (int j = 1; j < xLength - 1; j++) {
                    if (x.charAt(j) != s.charAt(++iterator)) {
                        break;
                    }
                    count++;
                }

                if (count == xLength) {
                    return i;
                }
            }
        }

        return -1;
    }
}
