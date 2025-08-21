import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGetEvenDigitSum {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {123456789, 20},
                {252, 4},
                {-22, -1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testGetEvenDigitSum(int n, int expectedResult) {
        assertEquals(GetEvenDigitSum.getEvenDigitSum(n), expectedResult);
    }
}
