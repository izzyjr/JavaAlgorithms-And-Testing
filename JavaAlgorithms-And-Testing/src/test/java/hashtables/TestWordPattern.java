package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestWordPattern {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"abba", "dog cat cat dog", true},
                {"abba", "dog dog dog dog", false},
                {"abba", "dog cat cat fish", false},
                {"aaa", "aa aa aa aa", false},
                {"aaba", "a a b a", true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testWordPattern(String pattern, String s, boolean expectedResult) {
        assertEquals(WordPattern.wordPattern(pattern, s), expectedResult);
    }
}
