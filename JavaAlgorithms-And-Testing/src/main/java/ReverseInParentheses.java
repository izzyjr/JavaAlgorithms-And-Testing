public class ReverseInParentheses {

    public static String reverseInParentheses(String string) {

        char[] array = string.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == '(') {
                int start = i;
                int end = i;
                int iterator = i;
                while (array[++iterator] != ')') {
                    if (array[iterator] == '(') {
                        i = start - 1;
                        start = iterator;
                    }
                }
                end = iterator;
                copyStringToArrayReversed(array, string, start, end);
                array[start] = '∆';
                array[end] = '∆';
                string = new String(array);
            }
        }
        return string.replace("∆", "");
    }

    private static void copyStringToArrayReversed(char[] array, String string, int start, int end) {
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













