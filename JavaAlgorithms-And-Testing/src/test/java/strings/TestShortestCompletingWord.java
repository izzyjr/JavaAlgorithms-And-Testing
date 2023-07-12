package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestShortestCompletingWord {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"1s3 PSt", new String[] {"step","steps","stripe","stepple"}, "steps"},
                {"1s3 456", new String[] {"looks","pest","stew","show"}, "pest"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testShortestCompletingWord(String licensePlate, String[] words, String expectedResult) {
        assertEquals(ShortestCompletingWord.shortestCompletingWord(licensePlate, words), expectedResult);
    }
}
