package strings;

public class CheckRecord {

    public static boolean checkRecord(String s) {

        int aCount = 0;
        int lCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aCount++;
                lCount = 0;
            } else if (s.charAt(i) == 'L') {
                lCount++;
            } else if (s.charAt(i) == 'P') {
                lCount = 0;
            }
            if (aCount >= 2 || lCount >= 3) {
                return false;
            }
        }

        return true;
    }
}
