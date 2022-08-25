import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSmallerNumbersThanCurrent {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {8, 1, 2, 2, 3}, new int[] {14, 0, 1, 1, 3}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testSmallerNumbersThanCurrent(int[] nums, int[] expectedResult) {
        assertEquals(SmallerNumbersThanCurrent.smallerNumbersThanCurrent(nums), expectedResult);
    }
}
