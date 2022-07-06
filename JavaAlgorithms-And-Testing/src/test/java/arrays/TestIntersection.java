package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIntersection {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 2, 1}, new int[] {2, 2}, new int[] {2}},
                {new int[] {4,9,5}, new int[] {9,4,9,8,4}, new int[] {4, 9}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIntersection(int[] nums1, int[] nums2, int[] expectedResult) {
        assertEquals(Intersection.intersection(nums1, nums2), expectedResult);
    }
}
