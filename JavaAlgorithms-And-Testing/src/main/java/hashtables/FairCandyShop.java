package hashtables;

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

        for (int aliceSize : aliceSizes) {
            for (int bobSize : bobSizes) {
                int aliceTotal = (aliceCandies + bobSize) - aliceSize;
                int bobTotal = (bobCandies + aliceSize) - bobSize;
                if (aliceTotal == fairAmount && bobTotal == fairAmount) {
                    answer[0] = aliceSize;
                    answer[1] = bobSize;
                    return answer;
                }
            }
        }

        return answer;
    }
}
