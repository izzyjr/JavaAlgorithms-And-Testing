import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsLucky {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {1230, true},
                {10, false},
                {999999, true},
                {11, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCommonCharacterCount(int n, boolean expectedResult) {
        assertEquals(IsLucky.isLucky(n), expectedResult);
    }
}
