import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAreEquallyStrong {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {10, 15, 15, 10, true},
                {10, 15, 5, 20, false},
                {1, 1, 1, 1, true},
                {10, 5, 10, 6, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAreEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight, boolean expectedResult) {
        assertEquals(AreEquallyStrong.areEquallyStrong(yourLeft, yourRight, friendsLeft, friendsRight), expectedResult);
    }
}
