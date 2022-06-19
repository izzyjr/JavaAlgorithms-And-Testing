package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestClassifyStrings {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"aeu", "bad"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testClassifyStrings(String s, String expectedResult) {
        assertEquals(ClassifyStrings.classifyStrings(s), expectedResult);
    }
}
