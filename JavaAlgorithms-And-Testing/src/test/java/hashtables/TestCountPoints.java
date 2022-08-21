package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCountPoints {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"B0B6G0R6R0R6G9", 1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCountPoints(String rings, int expectedResult) {
        assertEquals(CountPoints.countPoints(rings), expectedResult);
    }
}
