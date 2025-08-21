import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSharedDigit {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][] {
                {12, 23, true},
                {9, 99, false},
                {15, 55, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testHasSharedDigit(int a, int b, boolean expectedResult) {
        assertEquals(HasSharedDigit.hasSharedDigit(a, b), expectedResult);
    }
}
