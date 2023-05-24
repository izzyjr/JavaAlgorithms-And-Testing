package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLongestCommonPrefix {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"flower","flow","flight"}, "fl"},
                {new String[] {"dog","racecar","car"}, ""},
                {new String[] {"", "b"}, ""}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testLongestCommonPrefix(String[] strs, String expectedResult) {
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs), expectedResult);
    }
}
