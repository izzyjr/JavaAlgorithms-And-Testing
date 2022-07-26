package hashtables;

import java.util.HashMap;
import java.util.Map;

public class PossibleSums {

    public static int possibleSums(int[] coins, int[] quantity) {

        int length = coins.length;
        Map<Integer, Integer> coinQuantity = new HashMap<>();
        int arraySize = 0;

        for (int i = 0; i < length; i++) {
            arraySize += quantity[i];
            coinQuantity.put(coins[i], quantity[i]);
        }

        int[] allCoins = new int[arraySize];
        int i = 0;

        for (Map.Entry<Integer, Integer> entry : coinQuantity.entrySet()) {

            int counter = 0;

            while (counter < entry.getValue()) {
                allCoins[i] = entry.getKey();
                counter++;
                i++;
            }
        }

        return 0;
    }
}
