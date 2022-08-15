package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSearchInsert {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 3, 5, 6}, 5, 2},
                {new int[] {1, 3, 5, 6}, 2, 1},
                {new int[] {1, 3, 5, 6}, 7, 4}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testSearchInsert(int[] nums, int target, int expectedResult) {
        assertEquals(SearchInsert.searchInsert(nums, target), expectedResult);
    }
}
