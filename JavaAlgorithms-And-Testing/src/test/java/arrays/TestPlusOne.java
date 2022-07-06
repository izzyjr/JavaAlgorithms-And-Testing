package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPlusOne {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3}, new int[] {1, 2, 4}},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testPlusOne(int[] digits, int[] expectedResult) {
        assertEquals(PlusOne.plusOne(digits), expectedResult);
    }
}
