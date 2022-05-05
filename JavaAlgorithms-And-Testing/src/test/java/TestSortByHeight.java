import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestSortByHeight {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {-1, 150, 190, 170, -1, -1, 160, 180}, new int[] {-1, 150, 160, 170, -1, -1, 180, 190}},
                {new int[] {-1, -1, -1, -1, -1}, new int[] {-1, -1, -1, -1, -1}},
                {new int[] {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3}, new int[] {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testSortByHeight(int[] array, int[] expectedResult) {
        assertEquals(SortByHeight.sortByHeight(array), expectedResult);
    }
}
