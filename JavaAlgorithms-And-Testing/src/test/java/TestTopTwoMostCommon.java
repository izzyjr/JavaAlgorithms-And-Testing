import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTopTwoMostCommon {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3, 4, 5, 3, 4}, new int[] {4, 3}},
                {new int[] {1, 2, 3, 4, 5, 3, 4, 4}, new int[] {4, 3}},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testTopTwoMostCommon(int[] nums, int[] expectedResult) {
        assertEquals(TopTwoMostCommon.topTwoMostCommon(nums), expectedResult);
    }
}
