package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFirstDuplicate {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {2, 1, 3, 5, 3, 2}, 3},
                {new int[] {2, 4, 3, 5, 1}, -1},
                {new int[] {2, 2}, 2},
                {new int[] {2, 3, 3}, 3},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFirstDuplicate(int[] input, int expectedResult) {
        assertEquals(FirstDuplicate.firstDuplicate(input), expectedResult);
    }
}
