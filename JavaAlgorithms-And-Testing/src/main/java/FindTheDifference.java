public class FindTheDifference {

    public static char findTheDifference(String s, String t) {
        
        int tLength = t.length();
        int sLength = s.length();
        char result = 0;

        if (sLength == 0) {
            return t.charAt(0);
        }

        for (int i = 0; i < tLength; i++) {
            int count = 0;
            for (int j = 0; j < sLength; j++) {
                if (t.charAt(i) != s.charAt(j)) {
                    count++;
                }
                if (count == sLength) {
                    result = t.charAt(i);
                    break;
                }
            }
        }

        return result;
    }
}
