import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestHasSameLastDigit {

    @DataProvider(name="inputOutput")
    private Object[][] inputOutput() {
        return new Object[][] {
                {41, 22, 71, true},
                {23, 32, 42, true},
                {9, 99, 999, false},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testHasSameLastDigit(int a, int b, int c, boolean expectedResult) {
        assertEquals(HasSameLastDigit.hasSameLastDigit(a, b, c), expectedResult);
    }
}
