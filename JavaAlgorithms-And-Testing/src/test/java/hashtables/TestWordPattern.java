package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestWordPattern {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"abba", "dog cat cat dog", true},
                {"abba", "dog dog dog dog", false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testWordPattern(String pattern, String s, boolean expectedResult) {
        assertEquals(WordPattern.wordPattern(pattern, s), expectedResult);
    }
}
