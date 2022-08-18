package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindMaxConsecutiveOnes {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 0, 1, 1, 0, 1}, 2}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindMaxConsecutiveOnes(int[] nums, int expectedResult) {
        assertEquals(FindMaxConsecutiveOnes.findMaxConsecutiveOnes(nums), expectedResult);
    }
}
