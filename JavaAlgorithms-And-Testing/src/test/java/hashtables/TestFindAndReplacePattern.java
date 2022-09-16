package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestFindAndReplacePattern {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {

        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("mee");
        expectedResult.add("aqq");

        return new Object[][]{
                {new String[] {"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb", expectedResult}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindAndReplacePattern(String[] words, String pattern, List<String> expectedResult) {
        assertEquals(FindAndReplacePattern.findAndReplacePattern(words, pattern), expectedResult);
    }
}
