package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestReverseWords {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"Let's take LeetCode contest", "s'teL ekat edoCteeL tsetnoc"},
                {"God Ding", "doG gniD"},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testReverseWords(String s, String expectedResult) {
        assertEquals(ReverseWords.reverseWords(s), expectedResult);
    }
}
