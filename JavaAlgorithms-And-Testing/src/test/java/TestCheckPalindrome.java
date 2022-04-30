import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCheckPalindrome {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"aabaa", true},
                {"az", false},
                {"z", true},
                {"zzzazzazz", false},
                {"dogeeseseegod", true}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testAdjacentElementsProduct(String inputString, boolean expectedResult) {
        assertEquals(CheckPalindrome.checkPalindrome(inputString), expectedResult);
    }

}
