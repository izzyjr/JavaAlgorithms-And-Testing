import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestShapeArea {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {2, 5},
                {3, 13},
                {4, 25},
                {5, 41},
                {6, 61},
                {7, 85}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testShapeArea(int n, int expectedResult) {
        assertEquals(ShapeArea.shapeArea(n), expectedResult);
    }
}
