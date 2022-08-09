import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsHappy {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {19, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIsHappy(int n, boolean expectedResult) {
        assertEquals(IsHappy.isHappy(n), expectedResult);
    }
}
