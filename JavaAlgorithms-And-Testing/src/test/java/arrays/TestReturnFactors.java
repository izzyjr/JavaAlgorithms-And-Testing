package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestReturnFactors {

    @DataProvider(name = "inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {6, new int[] {1, 2, 3, 6}},
                {32, new int[] {1, 2, 4, 8, 16, 32}},
                {10, new int[] {1, 2, 5, 10}},
                {-1, new int[] {}},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testReturnFactors(int number, int[] expectedResult) {
        assertEquals(ReturnFactors.returnFactors(number), expectedResult);
    }
}
