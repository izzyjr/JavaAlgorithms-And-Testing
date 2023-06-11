package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestContainsNearbyDuplicate {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3, 1}, 3, true},
                {new int[] {1, 0, 1, 1}, 1, true},
                {new int[] {1, 2, 3, 1, 2, 3}, 2, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testContainsNearbyDuplicate(int[] nums, int k, boolean expectedResult) {
        assertEquals(ContainsNearbyDuplicate.containsNearbyDuplicate(nums, k), expectedResult);
    }
}
