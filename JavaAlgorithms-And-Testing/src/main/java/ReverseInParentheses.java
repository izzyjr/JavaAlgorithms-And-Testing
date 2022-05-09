import java.util.Arrays;

public class ReverseInParentheses {

    public static String reverseInParentheses(String string) {

        char[] array = string.toCharArray();
        int next = 0;

        for (int i = 0; i < array.length; i++) {
            int openBracketCount = 0;
            int closedBracketCount = 0;
            if (array[i] == '(') {
                openBracketCount++;
                int start = i;
                int end = i;
                int iterator = i;
                while (end == start && ++iterator < string.length()) {
                    if (array[iterator] == '(') {
                        openBracketCount++;
                        if (openBracketCount == 2) {
                            i = iterator - 1;
                        }
                    } else if (array[iterator] == ')') {
                        closedBracketCount++;
                        if (openBracketCount == closedBracketCount) {
                            end = iterator;
                        }
                    }
                }
                copyToArrayReversed(array, string, start, end);
                string = new String(array);
            }
        }
        return Arrays.toString(array);
    }

    private static void copyToArrayReversed(char[] array, String string, int start, int end) {
        int j = start;
        for (int i = end; i >= start; i--) {
            if (string.charAt(i) != '(' && string.charAt(i) != ')') {
                if (array[j] == '(' || array[j] == ')') {
                    int count = j;
                    while (array[count] == '(' || array[count] == ')') {
                        ++count;
                        array[count] = string.charAt(i);
                    }
                    j = count;
                } else {
                    array[j] = string.charAt(i);
                }
                j++;
            }
        }
    }
}













