package strings;

public class ValidParentheses {

    public static Boolean validParentheses(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        StringBuilder secondHalf = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i + 1) != ')') {
                secondHalf.append(')');
            }
            if (s.charAt(i) == '[' && s.charAt(i + 1) != ']') {
                secondHalf.append(')');
            }
            if (s.charAt(i) == '{' && s.charAt(i + 1) != '}') {
                secondHalf.append(')');
            }
        }

        if (secondHalf.length() != 0) {

        }

        return true;
    }
}
