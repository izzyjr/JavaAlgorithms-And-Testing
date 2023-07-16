package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FairCandyShop {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        Map<Integer, Integer> aliceMap = new HashMap<>();
        Map<Integer, Integer> bobMap = new HashMap<>();
        int aliceCandies = 0;
        int bobCandies = 0;

        int i, j;
        for (i = 0, j = 0; i < aliceSizes.length && j < bobSizes.length; i++, j++) {
            aliceCandies += aliceSizes[i];
            bobCandies += bobSizes[j];
            aliceMap.put(aliceSizes[i], aliceMap.getOrDefault(aliceSizes[i], 0) + 1);
            bobMap.put(bobSizes[j], bobMap.getOrDefault(bobSizes[j], 0) + 1);
        }

        System.out.println(aliceCandies);
        System.out.println(aliceMap);
        System.out.println(bobCandies);
        System.out.println(bobMap);


        int[] answer = new int[2];



        return answer;
    }
}
