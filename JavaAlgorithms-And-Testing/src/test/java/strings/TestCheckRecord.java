package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCheckRecord {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"PPALLL", false},
                {"LPLPLPLPLPL", true},
                {"LLPAA", false},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testCheckRecord(String s, Boolean expectedResult) {
        assertEquals(CheckRecord.checkRecord(s), expectedResult);
    }
}
