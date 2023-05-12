package arrays;

public class BuyAndSellStock {

    public static int buyAndSellStock(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (i + 1 < prices.length) {
                if (prices[i] > prices[i + 1]){
                    i++;
                }
            }

            for (int j = i + 1; j < prices.length; j++) {
                if (maxProfit < prices[j] - prices[i]) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }

        return maxProfit;
    }
}
