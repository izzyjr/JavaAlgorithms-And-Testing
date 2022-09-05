package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBuddyStrings {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"ab", "ba", true},
                {"abcd", "cbad", true},
                {"aa", "aa", true},
                {"ab", "ab", false},
                {"abcaa", "abcbb", false},
                {"aaaaaaabc", "aaaaaaacb", true},
                {"ab", "ca", false},
                {"abab", "abab", true},
                {"ab", "babbb", false}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testBuddyStrings(String s, String goal, Boolean expectedResult) {
        assertEquals(BuddyStrings.buddyStrings(s, goal), expectedResult);
    }
}
