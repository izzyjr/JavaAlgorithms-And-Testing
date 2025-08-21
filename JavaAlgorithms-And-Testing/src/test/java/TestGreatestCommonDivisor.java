import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGreatestCommonDivisor {

    @DataProvider(name = "inputOutput")
    private Object[][] inputOutput() {
        return new Object[][]{
                {12, 30, 6},
                {9, 18, -1},
                {25, 15, 5},
                {81, 153, 9}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testGreatestCommonDivisor(int a, int b, int expectedResult) {
        assertEquals(GreatestCommonDivisor.greatestCommonDivisor(a, b), expectedResult);
    }
}
