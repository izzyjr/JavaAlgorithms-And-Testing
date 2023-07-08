package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMostCommonWord {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"Bob hit a ball, the hit BALL flew far after it was hit.", new String[] {"hit"}, "ball"},
                {"a.", new String[] {}, "a"},
                {"Bob!", new String[] {"hit"}, "bob"}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testMostCommonWord(String paragraph, String[] banned, String expectedResult) {
        assertEquals(MostCommonWord.mostCommonWord(paragraph, banned), expectedResult);
    }
}
