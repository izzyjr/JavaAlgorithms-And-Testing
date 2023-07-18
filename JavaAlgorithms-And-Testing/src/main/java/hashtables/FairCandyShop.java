package hashtables;

import java.util.Arrays;

public class FairCandyShop {

    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {

        int aliceCandies = 0;
        int bobCandies = 0;

        for (int aliceSize : aliceSizes) {
            aliceCandies += aliceSize;
        }

        for (int bobSize : bobSizes) {
            bobCandies += bobSize;
        }

        int fairAmount = (aliceCandies + bobCandies) / 2;
        int[] answer = new int[2];

        for (int i = 0; i < aliceSizes.length; i++) {
            for (int j = i + 1; j < bobSizes.length; j++) {
                int aliceTotal = (aliceCandies + bobSizes[j]) - aliceSizes[i];
                int bobTotal = (bobCandies + aliceSizes[i]) - bobSizes[j];
                if (aliceTotal == fairAmount && bobTotal == fairAmount) {
                    answer[0] = aliceSizes[i];
                    answer[1] = bobSizes[j];
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }
}
