package hashtables;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindWords {

    public static List<String> findWords(String[] words) {

        Map<Character, Integer> first_row = new HashMap<Character, Integer>()
        {{
            put('q', 1); put('w', 1); put('e', 1); put('r', 1); put('t', 1);
            put('y', 1); put('u', 1); put('i', 1); put('o', 1); put('p', 1);
        }};

        Map<Character, Integer> second_row = new HashMap<Character, Integer>()
        {{
            put('a', 1); put('s', 1); put('d', 1); put('f', 1); put('g', 1);
            put('h', 1); put('j', 1); put('k', 1); put('l', 1);
        }};

        Map<Character, Integer> third_row = new HashMap<Character, Integer>()
        {{
            put('z', 1); put('x', 1); put('c', 1); put('v', 1); put('b', 1);
            put('n', 1); put('m', 1);
        }};

        Collection<Map<Character, Integer>> rows = new ArrayList<>();
        rows.add(first_row);
        rows.add(second_row);
        rows.add(third_row);

        List<String> result = new ArrayList<>();

        for (Map<Character, Integer> row : rows) {
            for (String word: words) {
                int count = 0;
                for (int i = 0; i < word.length(); i++) {
                    if (row.containsKey(Character.toLowerCase(word.charAt(i)))) {
                        count++;
                    }
                }
                if (count == word.length()) {
                    result.add(word);
                }
            }
        }

        return result;
    }
}
