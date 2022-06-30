package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsPathCrossing {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"NES", false}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testIsPathCrossing(String path, Boolean expectedResult) {
        assertEquals(IsPathCrossing.isPathCrossing(path), expectedResult);
    }
}
