package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindShortestSubArray {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1,2,2,3,1}, 2},
                {new int[] {1,2,2,3,1,4,2}, 6},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindShortestSubArray(int[] nums, int expectedResult) {
        assertEquals(FindShortestSubArray.findShortestSubArray(nums), expectedResult);
    }
}
