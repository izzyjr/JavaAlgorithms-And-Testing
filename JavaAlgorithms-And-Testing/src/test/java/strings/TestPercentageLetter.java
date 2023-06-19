package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPercentageLetter {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"foobar", 'o', 33},
                {"jjjj", 'k', 0}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testPercentageLetter(String s, char letter, int expectedResult) {
        assertEquals(PercentageLetter.percentageLetter(s, letter), expectedResult);
    }
}
