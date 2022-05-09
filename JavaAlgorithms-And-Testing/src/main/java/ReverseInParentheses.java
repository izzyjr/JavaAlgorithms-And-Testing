import java.util.Arrays;

public class ReverseInParentheses {

    public static String reverseInParentheses(String string) {

        char[] array = string.toCharArray();
        int next = 0;

        for (int i = 0; i < array.length; i++) {
            System.out.println("where we at: " + i);
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
                            next = iterator;
                        }
                        System.out.println("next - " + next);
                    } else if (array[iterator] == ')') {
                        closedBracketCount++;
                        if (openBracketCount == closedBracketCount) {
                            end = iterator;
                        }
                    }
                }
                System.out.println(start + " - " + end);
                int k = start;
                for (int j = end; j >= start; j--) {
                    if (string.charAt(j) != '(' && string.charAt(j) != ')') {
                        if (array[k] == '(' || array[k] == ')') {
                            int count = k;
                            while (array[count] == '(' || array[count] == ')') {
                                ++count;
                                array[count] = string.charAt(j);
                            }
                            k = count;
                            k++;
                        } else {
                            array[k] = string.charAt(j);
                            k++;
                        }
                    }
                }
                if (openBracketCount == 2) {
                    i = next - 1;
                }
            }
        }
        return Arrays.toString(array);
    }

}













