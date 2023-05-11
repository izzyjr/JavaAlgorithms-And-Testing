package arrays;

public class BuyAndSellStock {

    public static int buyAndSellStock(int[] prices) {

        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (maxProfit < prices[j] - prices[i]) {
                    maxProfit = prices[j] - prices[i];
                }
            }
        }

        return maxProfit;
    }
}
