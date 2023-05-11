package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBuyAndSellStock {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][] {
                {new int[] {7, 1, 5, 3, 6, 5}, 5},
                {new int[] {7, 6, 4, 3, 1}, 0},
                {new int[] {2, 4, 1}, 2}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testBuyAndSellStock(int[] prices, int expectedResult) {
        assertEquals(BuyAndSellStock.buyAndSellStock(prices), expectedResult);
    }
}
