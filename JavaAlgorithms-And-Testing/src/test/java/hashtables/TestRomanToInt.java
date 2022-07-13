package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRomanToInt {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"III", 3},
                {"LVIII", 58},
                {"MCMXCIV", 1994},
                {"DIV", 504},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testRomanToInt(String s, int expectedResult) {
        assertEquals(RomanToInt.romanToInt(s), expectedResult);
    }
}
