package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMissingNumber {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3,0,1}, 2},
                {new int[] {9,6,4,2,3,5,7,0,1}, 8},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testMissingNumber(int[] nums, int expectedResult) {
        assertEquals(MissingNumber.missingNumber(nums), expectedResult);
    }
}
