package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindAndReplacePattern {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb", new String[] {"mee", "aqq"}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindAndReplacePattern(String[] words, String pattern, String[] expectedResult) {
        assertEquals(FindAndReplacePattern.findAndReplacePattern(words, pattern), expectedResult);
    }
}
