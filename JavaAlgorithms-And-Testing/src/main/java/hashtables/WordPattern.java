package hashtables;

import java.util.ArrayList;

public class WordPattern {

    public static boolean wordPattern(String pattern, String s) {

        ArrayList<String> words = new ArrayList<>();
        String word = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                word += s.charAt(i);
            } else {
                words.add(word);
                word = "";
            }
        }

        words.add(word);

        return false;
    }
}
