package strings;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        int size = strs.length;
        int index = 0;
        String result = "";
        char character;

        for (String str : strs) {
            int count = 0;
            if (str.length() > 0) {
                character = str.charAt(index);
                for (int j = 1; j < size; j++) {
                    if (character == strs[j].charAt(index)) {
                        count++;
                    } else {
                        return result.toString();
                    }
                }
                if (count == size - 1) {
                    result += character;
                }
                index++;
            }
        }

        return result.toString();
    }
}
