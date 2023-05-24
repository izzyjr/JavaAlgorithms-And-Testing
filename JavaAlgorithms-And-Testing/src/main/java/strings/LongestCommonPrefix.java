package strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int shortest = strs[0].length();
        StringBuilder result = new StringBuilder();
        char character;

        for (String str : strs) {
            if (str.length() < shortest) {
                shortest = str.length();
            }
        }

        for (int i = 0; i < shortest; i++) {
            int count = 0;
            character = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (character == strs[j].charAt(i)) {
                    count++;
                } else {
                    return result.toString();
                }
            }
            if (count == strs.length - 1) {
                result.append(character);
            }
        }

        return result.toString();
    }
}
