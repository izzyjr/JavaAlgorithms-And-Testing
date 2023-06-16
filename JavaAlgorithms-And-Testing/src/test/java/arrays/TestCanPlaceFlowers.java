package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCanPlaceFlowers {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 0, 0, 0, 1}, 1, true},
                {new int[] {1, 0, 0, 0, 1}, 2, false},
                {new int[] {1, 0, 0, 0, 0, 1}, 2, false},
                {new int[] {1, 0, 0, 0, 0, 0, 1}, 2, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCanPlaceFlowers(int[] flowerbed, int n, boolean expectedResult) {
        assertEquals(CanPlaceFlowers.canPlaceFlowers(flowerbed, n), expectedResult);
    }
}
