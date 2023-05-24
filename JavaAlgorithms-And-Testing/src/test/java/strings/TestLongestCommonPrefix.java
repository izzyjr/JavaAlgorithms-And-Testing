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
                {new String[] {"", "b"}, ""},
                {new String[] {"ab", "a"}, "a"},
                {new String[] {"cir", "car"}, "c"},
                {new String[] {"dog", "dose", "doddle"}, "do"},
                {new String[] {"israel", "israel", "israel"}, "israel"},
                {new String[] {"", "", ""}, ""}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testLongestCommonPrefix(String[] strs, String expectedResult) {
        assertEquals(LongestCommonPrefix.longestCommonPrefix(strs), expectedResult);
    }
}
