package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsIsomorphic {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"egg", "add", true},
                {"foo", "bar", false},
                {"badc", "baba", false}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testIsPathIsomorphic(String s, String t, Boolean expectedResult) {
        assertEquals(IsIsomorphic.isIsomorphic(s, t), expectedResult);
    }
}
