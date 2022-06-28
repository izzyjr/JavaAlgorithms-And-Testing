package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRemoveDigit {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"123", '3', "12"},
                {"1231", '1', "231"},
                {"133235", '3', "13325"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testClassifyStrings(String number, char digit, String expectedResult) {
        assertEquals(RemoveDigit.removeDigit(number, digit), expectedResult);
    }
}
