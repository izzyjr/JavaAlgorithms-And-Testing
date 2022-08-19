package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCountPoints {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"R3G2B1", 3}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCountPoints(String rings, int expectedResult) {
        assertEquals(CountPoints.countPoints(rings), expectedResult);
    }
}
