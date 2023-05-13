package arrays;

public class BuyAndSellStock {

    public static int buyAndSellStock(int[] prices) {

        int maxProfit = 0;
        int lowestPrice = prices[0];
        int date = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < lowestPrice && i != prices.length -1) {
                lowestPrice = prices[i];
                date = i;
            }
        }

        for (int j = date; j < prices.length; j++) {
            if (prices[j] - lowestPrice > maxProfit) {
                maxProfit = prices[j] - lowestPrice;
            }
        }

        return maxProfit;
    }
}
