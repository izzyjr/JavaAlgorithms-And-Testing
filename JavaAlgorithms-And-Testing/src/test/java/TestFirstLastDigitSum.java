import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFirstLastDigitSum {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {252, 4},
                {257, 9},
                {0, 0},
                {5, 10},
                {-10, -1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFirstLastDigitSum(int n, int expectedResult) {
        assertEquals(FirstLastDigitSum.firstLastDigitSum(n), expectedResult);
    }
}
