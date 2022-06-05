import java.util.HashMap;
import java.util.Map;

public class PalindromeRearranging {

    public static boolean palindromeRearranging(String inputString) {

        int length = inputString.length();
        Map<String, Integer> repeats = new HashMap<>();

        for (int i = 0; i < length; i++) {
            String key = String.valueOf(inputString.charAt(i));
            if (!repeats.containsKey(key)) {
                repeats.put(key, 1);
            } else {
                repeats.remove(key);
            }
        }
        return repeats.size() <= 1;
    }

    // first attempt solution
    public static boolean palindromeRearranging0(String inputString) {

        int pairCounter = 0;
        String[] stringArrayOne = inputString.split("");
        String[] stringArrayTwo = inputString.split("");
        int arrayLength = stringArrayOne.length;

        for(int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (i != j) {
                    if (stringArrayOne[i].equals(stringArrayTwo[j])) {
                        pairCounter++;
                        stringArrayTwo[j] = "*";
                        j = arrayLength;
                    }
                }
            }
        }

        if (isEven(arrayLength)) {
            return pairCounter == arrayLength;
        } else {
            return pairCounter == arrayLength - 1;
        }
    }

    public static boolean isEven(int stringLength) {
        return stringLength % 2 == 0;
    }
}
