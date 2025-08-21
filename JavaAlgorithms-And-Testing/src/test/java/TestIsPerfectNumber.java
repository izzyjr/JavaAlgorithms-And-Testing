import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsPerfectNumber {

    @DataProvider(name = "inputOutput")
    private Object[][] inputOutput() {
        return new Object[][]{
                {6, true},
                {28, true},
                {5, false},
                {-1, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIsPerfectNumber(int number, boolean expectedResult) {
        assertEquals(IsPerfectNumber.isPerfectNumber(number), expectedResult);
    }
}
