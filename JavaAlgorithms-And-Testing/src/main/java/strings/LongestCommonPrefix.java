package strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int size = strs.length;
        int increase = 0;
        StringBuilder result = new StringBuilder();
        char character;

        for (int i = 0; i < size; i++) {
            int count = 0;
            character = strs[i].charAt(increase);
            for (int j = i + 1; j < size; j++) {
                if (character == strs[j].charAt(increase)) {
                    count++;
                } else {
                    return result.toString();
                }
            }
            if (count == size - 1) {
                result.append(character);
            }
            increase++;
        }

        return result.toString();
    }
}
