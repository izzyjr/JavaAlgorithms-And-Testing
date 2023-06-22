package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNumIdenticalPairs {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3, 1, 1, 3}, 4},
                {new int[] {1, 1, 1, 1}, 6},
                {new int[] {1, 2, 3}, 0}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testNumIdenticalPairs(int[] nums, int expectedResult) {
        assertEquals(NumIdenticalPairs.numIdenticalPairs(nums), expectedResult);
    }
}
