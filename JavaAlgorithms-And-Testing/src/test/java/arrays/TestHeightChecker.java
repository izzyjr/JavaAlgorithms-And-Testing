package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestHeightChecker {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 1, 4, 2, 1, 3}, 3},
                {new int[] {5, 1, 2, 3, 4}, 5},
                {new int[] {1, 2, 3, 4, 5}, 0}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testHeightChecker(int[] heights, int expectedResult) {
        assertEquals(HeightChecker.heightChecker(heights), expectedResult);
    }
}
