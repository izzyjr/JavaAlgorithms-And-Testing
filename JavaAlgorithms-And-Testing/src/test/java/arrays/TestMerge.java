package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMerge {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3, 0, 0, 0}, 3, new int[] {2, 5, 6}, 3, new int[] {1, 2, 2, 3, 5, 6}},
                {new int[] {1}, 1, new int[] {}, 0, new int[] {1}},
                {new int[] {0}, 0, new int[] {1}, 1, new int[] {1}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testMerge(int[] nums1, int m, int[] nums2, int n, int[] expectedResult) {
        assertEquals(Merge.merge(nums1, m , nums2, n), expectedResult);
    }
}
