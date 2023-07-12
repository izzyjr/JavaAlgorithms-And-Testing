package strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String[] letters = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase().split("");
        Map<Character, Integer> wordMap = new HashMap<>();
        int wordLength = Integer.MAX_VALUE;
        String answer = "";

        for (String word : words) {
            for (int i = 0; i < words.length; i++) {
                wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0) + 1);
            }
            int count = 0;
            for (String s : letters) {
                char letter = s.charAt(0);
                if (wordMap.containsKey(letter)) {
                    count++;
                }
            }
            if (count == letters.length) {
                if (wordLength > word.length()) {
                    wordLength = word.length();
                    answer = word;
                }
            }
        }

        return answer;
    }
}
