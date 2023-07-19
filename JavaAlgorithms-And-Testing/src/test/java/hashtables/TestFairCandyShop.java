package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFairCandyShop {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 1}, new int[] {2, 2}, new int[] {1, 2}},
                {new int[] {1, 2}, new int[] {2, 3}, new int[] {1, 2}},
                {new int[]{2}, new int[] {1, 3}, new int[] {2, 3}},
                {new int[]{2, 1, 4}, new int[] {4, 1}, new int[] {2, 1}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFairCandyShop(int[] aliceSizes, int[] bobSizes, int[] expectedResult) {
        assertEquals(FairCandyShop.fairCandySwap(aliceSizes, bobSizes), expectedResult);
    }
}
