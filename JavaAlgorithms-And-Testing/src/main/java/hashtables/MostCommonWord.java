package hashtables;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned) {

        String[] words = paragraph.split("[^a-zA-Z]+");
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : words) {
            wordCount.put(word.toLowerCase(), wordCount.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        for (String ban : banned) {
            wordCount.remove(ban.toLowerCase());
        }

        String result = "";
        int count = 0;

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (count < entry.getValue()) {
                count = entry.getValue();
                result = entry.getKey();
            }
        }

        return result;
    }
}
