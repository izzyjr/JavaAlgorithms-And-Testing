package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSingleNumber {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {2, 2, 3, 2}, 3},
                {new int[] {7, 7, 7, 1, 1, 1, 6}, 6},
                {new int[] {3, 5, 1, 3, 1, 3, 1}, 5}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void singleNumber(int[] nums, int expectedResult) {
        assertEquals(SingleNumber.singleNumber(nums), expectedResult);
    }
}
