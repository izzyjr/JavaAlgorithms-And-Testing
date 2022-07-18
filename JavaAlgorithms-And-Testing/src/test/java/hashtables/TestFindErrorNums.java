package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindErrorNums {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 2, 4}, new int[] {2, 3}},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindErrorNums(int[] nums, int[] expectedResult) {
        assertEquals(FindErrorNums.findErrorNums(nums), expectedResult);
    }
}
