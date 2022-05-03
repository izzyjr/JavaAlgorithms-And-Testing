import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAllLongestStrings {

    @DataProvider(name="inputOutputArrays")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"aba", "aa", "ad", "vcd", "aba"}, new String[] {"aba", "vcd", "aba"}},
                {new String[] {"abc", "eeee", "abcd", "dcd"}, new String[] {"eeee", "abcd"}},
                {new String[] {"abacaba", "abacab", "abac", "xxxxxx"}, new String[] {"abacaba"}},
                {new String[] {"aa"}, new String[] {"aa"}}
        };
    }

    @Test(dataProvider = "inputOutputArrays")
    private void testAllLongestStrings(String[] inputArray, String[] expectedResult) {
        assertEquals(AllLongestStrings.allLongestStrings(inputArray), expectedResult);
    }

}
