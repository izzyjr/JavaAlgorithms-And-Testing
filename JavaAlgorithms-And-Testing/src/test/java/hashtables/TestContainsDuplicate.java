package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestContainsDuplicate {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {0, 1, 2, 3, 5, 2}, true},
                {new int[] {1, 2, 1}, true},
                {new int[] {99, 99}, true},
                {new int[] {1, 2, 3, 4, 5, 6}, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testContainsDuplicate(int[] nums, boolean expectedResult) {
        assertEquals(ContainsDuplicate.containsDuplicate(nums), expectedResult);
    }
}
