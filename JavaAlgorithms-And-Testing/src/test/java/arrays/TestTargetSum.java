package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestTargetSum {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}},
                {new int[] {3, 2, 4}, 6, new int[] {1, 2}},
                {new int[] {3, 3}, 6, new int[] {0, 1}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testTargetSum(int[] nums, int target, int[] expectedResult) {
        assertEquals(TargetSum.targetSum(nums, target), expectedResult);
    }
}
