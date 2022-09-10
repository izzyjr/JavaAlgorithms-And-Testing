package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDistributeCandies {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 1, 2, 2, 3, 3}, 3},
                {new int[] {1, 1, 2, 3}, 2},
                {new int[] {1000, 1000, 2, 1, 2, 5, 3, 1}, 4}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testDistributeCandies(int[] nums, int expectedResult) {
        assertEquals(DistributeCandies.distributeCandies(nums), expectedResult);
    }
}
