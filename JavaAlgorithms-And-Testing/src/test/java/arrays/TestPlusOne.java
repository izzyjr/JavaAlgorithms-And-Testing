package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPlusOne {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3}, new int[] {1, 2, 4}},
                {new int[] {9}, new int[] {1, 0}},
                {new int[] {9, 9, 9}, new int[] {1, 0, 0, 0}},
                {new int[] {8, 9, 9, 9}, new int[] {9, 0, 0, 0}},
                {new int[] {9, 9}, new int[] {1, 0, 0}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testPlusOne(int[] digits, int[] expectedResult) {
        assertEquals(PlusOne.plusOne(digits), expectedResult);
    }
}
