package hashtables;

import java.util.HashMap;
import java.util.Map;

public class FairCandyShop {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        Map<Integer, Integer> aliceMap = new HashMap<>();
        Map<Integer, Integer> bobMap = new HashMap<>();
        int aliceCandies = 0;
        int bobCandies = 0;

        for (int aliceSize : aliceSizes) {
            aliceCandies += aliceSize;
            aliceMap.put(aliceSize, aliceMap.getOrDefault(aliceSize, 0) + 1);
        }

        for (int bobSize : bobSizes) {
            bobCandies += bobSize;
            bobMap.put(bobSize, bobMap.getOrDefault(bobSize, 0) + 1);
        }

        int fairAmount = (aliceCandies + bobCandies) / 2;

        System.out.println(aliceCandies);
        System.out.println(aliceMap);
        System.out.println(bobCandies);
        System.out.println(bobMap);
        System.out.println(fairAmount);


        int[] answer = new int[2];



        return answer;
    }
}
