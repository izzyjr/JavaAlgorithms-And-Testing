package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDetectCapitalUse {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"USA", true},
                {"FlaG", false},
                {"Peace", true},
                {"ggg", true},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testDetectCapitalUse(String word, Boolean expectedResult) {
        assertEquals(DetectCapitalUse.detectCapitalUse(word), expectedResult);
    }
}
