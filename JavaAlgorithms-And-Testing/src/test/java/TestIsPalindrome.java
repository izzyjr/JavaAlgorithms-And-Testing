import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsPalindrome {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {-1221, true},
                {707, true},
                {11212, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIsPalindrome(int n, boolean expectedResult) {
        assertEquals(IsPalindrome.isPalindrome(n), expectedResult);
    }
}
