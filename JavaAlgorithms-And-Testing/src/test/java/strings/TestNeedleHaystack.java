package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNeedleHaystack {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"sadbutsad", "sad", 0},
                {"leetcode", "leeto", -1},
                {"hello", "ll", 2}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testNeedleHaystack(String haystack, String needle, int expectedResult) {
        assertEquals(NeedleHaystack.needleHaystack(haystack, needle), expectedResult);
    }
}
