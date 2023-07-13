package strings;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String[] letters = licensePlate.replaceAll("[^a-zA-Z]", "").toLowerCase().split("");
        Map<Character, Integer> wordMap = new HashMap<>();
        int wordLength = Integer.MAX_VALUE;
        String shortestWord = "";

        for (String word : words) {

            int length = word.length();
            for (int i = 0; i < length; i++) {
                wordMap.put(word.charAt(i), wordMap.getOrDefault(word.charAt(i), 0) + 1);
            }

            int count = 0;
            for (String letter : letters) {
                if (wordMap.containsKey(letter.charAt(0))) {
                    if (wordMap.get(letter.charAt(0)) == 1) {
                        wordMap.remove(letter.charAt(0));
                    } else {
                        wordMap.put(letter.charAt(0), wordMap.get(letter.charAt(0)) - 1);
                    }
                    count++;
                }
            }

            if (count == letters.length) {
                if (wordLength > length) {
                    wordLength = length;
                    shortestWord = word;
                }
            }

            wordMap.clear();
        }

        return shortestWord;
    }
}
