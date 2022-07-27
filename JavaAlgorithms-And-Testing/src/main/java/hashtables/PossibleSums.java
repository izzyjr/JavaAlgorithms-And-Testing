package hashtables;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PossibleSums {

    public static int possibleSums(int[] coins, int[] quantity) {

        int length = coins.length;
        int arraySize = 0;

        for (int i = 0; i < length; i++) {
            arraySize += quantity[i];
        }

        int[] allCoins = new int[arraySize];
        int x = 0;

        for (int j = 0; j < length; j++) {

            int counter = 0;

            while (counter < quantity[j]) {
                allCoins[x] = coins[j];
                counter++;
                x++;
            }
        }

        return 0;
    }
}
