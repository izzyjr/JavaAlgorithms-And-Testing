package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMajorityElement {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3, 2, 3}, 3},
                {new int[] {2, 2, 1, 1, 1, 2, 2}, 2}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testMajorityElement(int[] nums, int expectedResult) {
        assertEquals(MajorityElement.majorityElement(nums), expectedResult);
    }
}
