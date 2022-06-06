import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestArrayMaximalAdjacentDifference {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {2, 4, 1, 0}, 3},
                {new int[] {10, 11, 13}, 2},
                {new int[] {-14, 15, -15}, 30},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testArrayMaximalAdjacentDifference(int[] input, int expectedResult) {
        assertEquals(ArrayMaximalAdjacentDifference.arrayMaximalAdjacentDifference(input), expectedResult);
    }
}
