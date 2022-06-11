import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAvoidObstacles {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {5, 3, 6, 7, 9}, 4}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFirstDuplicate(int[] inputArray, int expectedResult) {
        assertEquals(AvoidObstacles.avoidObstacles(inputArray), expectedResult);
    }
}
