public class FirstNotRepeatingCharacter {

    public static char firstNotRepeatingCharacter(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    count++;
                    if (count > 0 && i != s.length() - 1 && j != s.length() - 1) {
                        i++;
                        j = 0;
                        if (i != s.length() - 1) {
                            count = 0;
                        }
                    }
                }
            }
            if (count == 0) {
                return s.charAt(i);
            }
            count = 0;
        }
        return '_';
    }

}
