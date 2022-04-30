import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAdjacentElementsProduct {

    @DataProvider(name="inputAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3, 6, -2, -5, 7, 3}, new int[] {21}},
                {new int[] {5, 6, -4, 2, 3, 2, -23}, new int[] {30}},
                {new int[] {4, 1, 2, 3, 1, 5}, new int[] {6}}
        };
    }

    @Test(dataProvider = "inputAndResult")
    private void testAdjacentElementsProduct(int[] inputArray, int[] expectedResult) {
        assertEquals(AdjacentElementsProduct.adjacentElementsProduct(inputArray), expectedResult[0]);
    }
}
