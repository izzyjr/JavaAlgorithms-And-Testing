package strings;

import java.util.Stack;

public class ValidParentheses {

    public static Boolean validParentheses(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        Stack stack = new Stack();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                if (s.charAt(i) == '(') {
                    stack.push(')');
                } else if (s.charAt(i) == '[') {
                    stack.push(']');
                } else if (s.charAt(i) == '{') {
                    stack.push('}');
                }
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if (!stack.pop().equals(s.charAt(i))) {
                        return false;
                    }
                }
            }
        }

        return stack.isEmpty();
    }
}
