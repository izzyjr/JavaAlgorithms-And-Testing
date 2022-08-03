package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestValidAnagram {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][] {
                {"anagram", "nagaram", true},
                {"aacc", "ccac", false}
        };
    }

    @Test(dataProvider="stringsAndResult")
    private void testValidAnagram(String s, String t, Boolean expectedResult) {
        assertEquals(ValidAnagram.validAnagram(s, t), expectedResult);
    }
}
