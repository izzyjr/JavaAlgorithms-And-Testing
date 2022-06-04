import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPalindromeRearranging {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"murderforajarofredrum", true},
                {"dogeeseseegod", true},
                {"abca", false},
                {"aabb", true},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testPalindromeRearranging(String inputString, boolean expectedResult) {
        assertEquals(PalindromeRearranging.palindromeRearranging(inputString), expectedResult);
    }
}
