package strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        char[] letters = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        int shortestLength = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String word : words) {

            Map<Character, Integer> wordMap = new HashMap<>();
            int length = word.length();

            for (int i = 0; i < length; i++) {
                wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0) + 1);
            }

            int count = 0;

            for (char letter : letters) {
                if (wordMap.containsKey(letter)) {
                    if (wordMap.get(letter) == 1) {
                        wordMap.remove(letter);
                    } else {
                        wordMap.put(letter, wordMap.get(letter) - 1);
                    }
                    count++;
                }
            }

            if (count == letters.length) {
                if (shortestLength > length) {
                    shortestLength = length;
                    shortestWord = word;
                }
            }
        }

        return shortestWord;
    }
}
