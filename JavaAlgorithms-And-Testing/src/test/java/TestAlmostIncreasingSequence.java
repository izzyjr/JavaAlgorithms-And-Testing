import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAlmostIncreasingSequence {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 3, 2, 1}, false},
                {new int[] {0, -2, 5, 6}, true},
                {new int[] {1, 2, 3, 4, 3, 6}, true},
                {new int[] {1, 2, 3, 4, 5, 1, 2, 3, 4}, false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAlmostIncreasingSequence(int[] sequence, boolean expectedResult) {
        assertEquals(AlmostIncreasingSequence.almostIncreasingSequence(sequence), expectedResult);
    }

}
