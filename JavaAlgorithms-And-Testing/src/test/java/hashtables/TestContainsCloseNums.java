package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestContainsCloseNums {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {0, 1, 2, 3, 5, 2}, 3, true},
                {new int[] {1, 2, 1}, 0, false},
                {new int[] {99, 99}, 2, true},
                {new int[] {2, 2}, 3, true},
                {new int[] {1, 2, 3, 1, 1, 2, 3}, 0, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testContainsCloseNums(int[] nums, int k, boolean expectedResult) {
        assertEquals(ContainsCloseNums.containsCloseNums(nums, k), expectedResult);
    }
}
