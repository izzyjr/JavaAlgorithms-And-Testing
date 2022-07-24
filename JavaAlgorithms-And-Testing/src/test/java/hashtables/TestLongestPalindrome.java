package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLongestPalindrome {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"abccccdd", 7},
                {"bb", 2},
                {"ccc", 3},
                {"bananas", 3},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testLongestPalindrome(String s, int expectedResult) {
        assertEquals(LongestPalindrome.longestPalindrome(s), expectedResult);
    }
}
