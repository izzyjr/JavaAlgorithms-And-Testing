import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSumOfTwo {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3}, new int[] {10, 20, 30, 40}, 42, true},
                {new int[] {1, 2, 3, 4}, new int[] {}, 4, false},
                {new int[] {4, 6, 4, 2, 9, 6, 6, 2, 9, 2}, new int[] {3, 4, 5, 1, 4, 10, 9, 9, 6, 4}, 5, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testSumOfTwo(int[] a, int[] b, int v, boolean expectedResult) {
        assertEquals(SumOfTwo.sumOfTwo(a, b, v), expectedResult);
    }
}
