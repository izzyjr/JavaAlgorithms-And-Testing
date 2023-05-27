package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNextGreaterElement {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {4, 1, 2}, new int[] {1, 3, 4, 2}, new int[] {-1, 3, -1}},
                {new int[] {2, 4}, new int[] {1, 2, 3, 4}, new int[] {3, -1}},
                {new int[] {6, 5}, new int[] {6, 5, 3, 2, 7}, new int[] {7, 7}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testNextGreaterElement(int[] nums1, int[] nums2, int[] expectedResult) {
        assertEquals(NextGreaterElement.nextGreaterElement(nums1, nums2), expectedResult);
    }
}
