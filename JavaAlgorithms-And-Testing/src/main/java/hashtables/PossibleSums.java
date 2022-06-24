package hashtables;

import java.util.HashMap;
import java.util.Map;

public class PossibleSums {

    public static int possibleSums(int[] coins, int[] quantity) {

        Map<Integer, Integer> coinQuantity = new HashMap<>();
        int length = coins.length;

        for (int i = 0; i < length; i++) {
            coinQuantity.put(coins[i], quantity[i]);
        }

        return 0;
    }
}
