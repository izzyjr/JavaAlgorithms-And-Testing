package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFirstUniqueChar {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"deftones", 0},
                {"pineapple", 1},
                {"racecar", 3},
                {"aabb", -1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFirstUniqueChar(String s, int expectedResult) {
        assertEquals(FirstUniqueChar.firstUniqueChar(s), expectedResult);
    }
}
