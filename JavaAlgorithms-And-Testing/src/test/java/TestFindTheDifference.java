import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindTheDifference {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"abcd", "abcde", 'e'},
                {"", "y", 'y'}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testFindTheDifference(String s, String t, char expectedResult) {
        assertEquals(FindTheDifference.findTheDifference(s, t), expectedResult);
    }
}
