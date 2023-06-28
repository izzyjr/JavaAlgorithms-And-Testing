package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLongestHarmoniousSubsequence {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 3, 2, 2, 5, 2, 3, 7}, 5},
                {new int[] {1, 2, 3, 4}, 2},
                {new int[] {1, 1, 1, 1}, 0},
                {new int[] {1, 2, 1, 3, 0, 0, 2, 2, 1, 3, 3}, 6}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testLongestHarmoniousSubsequence(int[] nums, int expectedResult) {
        assertEquals(LongestHarmoniousSubsequence.longestHarmoniousSubsequence(nums), expectedResult);
    }
}
