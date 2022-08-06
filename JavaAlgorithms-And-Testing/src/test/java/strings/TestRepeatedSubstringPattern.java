package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRepeatedSubstringPattern {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"abcabcabcabc", true},
                {"abcaabca", true},
                {"aaaaa", true},
                {"aba", false},
                {"∆", false}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testRepeatedSubstringPattern(String s, Boolean expectedResult) {
        assertEquals(RepeatedSubstringPattern.repeatedSubstringPattern(s), expectedResult);
    }
}
