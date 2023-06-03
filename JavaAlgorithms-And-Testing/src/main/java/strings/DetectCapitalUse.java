package strings;

public class DetectCapitalUse {

    public static boolean detectCapitalUse(String word) {

        if (Character.isUpperCase(word.charAt(0))) {
            int count_upper = 1;
            int count_lower = 0;

            for (int i = 1; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))) {
                    count_upper++;
                } else {
                    count_lower++;
                }
            }
            return count_upper == word.length() || count_lower == word.length() - 1;

        } else {
            for (int j = 1; j < word.length(); j++) {
                if (Character.isUpperCase(word.charAt(j))) {
                    return false;
                }
            }
            return true;
        }
    }
}
