import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestArrayChange {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 1, 1}, 3},
                {new int[] {2, 1, 10, 1}, 12},
                {new int[] {3122, -645, 2616, 13213, -8069}, 25559}
        };
    }

    @Test(dataProvider="inputOutput")
    private void testArrayChange(int[] inputArray, int expectedResult) {
        assertEquals(ArrayChange.arrayChange(inputArray), expectedResult);
    }
}
