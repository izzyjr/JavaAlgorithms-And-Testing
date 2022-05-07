import com.sun.source.tree.WhileLoopTree;

public class ReverseInParentheses {

    public static String reverseInParentheses(String string) {

        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length(); i++) {
            int openBracketCount = 0;
            int closedBracketCount = 0;
            if (stringBuilder.charAt(i) == '(') {
                openBracketCount++;
                int start = i;
                int end = i;
                int iterator = i;
                while (end == start) {
                    ++iterator;
                    if (stringBuilder.charAt(iterator) == '(') {
                        openBracketCount++;
                    } else if (stringBuilder.charAt(iterator) == ')') {
                        closedBracketCount++;
                        if (openBracketCount == closedBracketCount) {
                            end = iterator;
                        }
                    }
                }
                System.out.println(start + " " + end);
            }
        }

        return stringBuilder.toString();
    }

}
