package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestShortestToChar {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"loveleetcode", 'e', new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}},
                {"aaab", 'b', new int[] {3, 2, 1, 0}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testShortestToChar(String s, char c, int[] expectedResult) {
        assertEquals(ShortestToChar.shortestToChar(s, c), expectedResult);
    }
}
