import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsHappy {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {19, true},
                {2, false},
                {116, false},
                {333, false},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIsHappy(int n, boolean expectedResult) {
        assertEquals(IsHappy.isHappy(n), expectedResult);
    }
}
