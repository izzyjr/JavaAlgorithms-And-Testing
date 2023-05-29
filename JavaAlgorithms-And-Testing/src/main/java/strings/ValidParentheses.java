package strings;

public class ValidParentheses {

    public static Boolean validParentheses(String s) {

        if (s.length() % 2 != 0) {
            return false;
        }

        String secondHalf = "";
        int half = s.length() / 2;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length()) {
                if (i == half - 1) {
                    if (s.charAt(i) == '(') {
                        secondHalf += ')';
                    } else if (s.charAt(i) == '[') {
                        secondHalf += ']';
                    } else if (s.charAt(i) == '{') {
                        secondHalf += '}';
                    }
                } else {
                    if (s.charAt(i) == '(' && s.charAt(i + 1) != ')') {
                        secondHalf += ')';
                    } else if (s.charAt(i) == '[' && s.charAt(i + 1) != ']') {
                        secondHalf += ']';
                    } else if (s.charAt(i) == '{' && s.charAt(i + 1) != '}') {
                        secondHalf += '}';
                    }
                }
            }
        }

        System.out.println("second half: " + secondHalf);

        if (secondHalf.length() != 0) {
            for (int j = secondHalf.length() - 1; j > 0; j--) {
                if (secondHalf.charAt(j) != s.charAt(half)) {
                    return false;
                }
                half++;
            }
        }

        return true;
    }
}
