package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLengthOfLastWord {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"Hello World", 5},
                {"   fly me   to   the moon  ", 4},
                {"luffy is still joyboy", 6},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testLengthOfLastWord(String s, int expectedResult) {
        assertEquals(LengthOfLastWord.lengthOfLastWord(s), expectedResult);
    }
}
