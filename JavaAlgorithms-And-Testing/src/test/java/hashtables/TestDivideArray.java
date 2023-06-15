package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDivideArray {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3, 2, 3, 2, 2, 2}, true},
                {new int[] {1, 2, 3, 4}, false},
                {new int[] {9, 4, 18, 3, 2, 6, 18, 15, 7, 15, 6, 4, 15, 14, 7, 4, 15, 4, 3, 17, 9, 13, 13, 12, 2, 14, 12, 17}, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testDivideArray(int[] nums, boolean expectedResult) {
        assertEquals(DivideArray.divideArray(nums), expectedResult);
    }
}
