package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMoveZeroes {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {3,0,1}, new int[] {3,1,0}},
                {new int[] {0,1,0,3,12}, new int[] {1,3,12,0,0}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testMoveZeroes(int[] nums, int[] expectedResult) {
        assertEquals(MoveZeroes.moveZeroes(nums), expectedResult);
    }
}
