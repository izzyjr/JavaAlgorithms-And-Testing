package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRemoveDuplicates {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 1, 2}, new int[] {1, 2, 2}},
                {new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, new int[] {0, 1, 2, 3, 4, 2, 2, 3, 3, 4}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testRemoveDuplicates(int[] nums, int[] expectedResult) {
        assertEquals(RemoveDuplicates.removeDuplicates(nums), expectedResult);
    }
}
