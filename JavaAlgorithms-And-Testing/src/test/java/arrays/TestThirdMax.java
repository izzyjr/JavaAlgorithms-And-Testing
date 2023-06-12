package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestThirdMax {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3, 2, 1}, 1},
                {new int[] {1, 2}, 2},
                {new int[] {2,2,3,1}, 1},
                {new int[] {1, 2147483647, -2147483648}, -2147483648}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testThirdMax(int[] nums, int expectedResult) {
        assertEquals(ThirdMax.thirdMax(nums), expectedResult);
    }
}
