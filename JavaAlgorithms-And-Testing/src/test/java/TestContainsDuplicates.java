import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestContainsDuplicates {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3, 1}, true},
                {new int[] {1}, false},
                {new int[] {0, 4, 5, 0, 3, 6}, true},
                {new int[] {2, 3, 3}, true},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testContainsDuplicate(int[] input, boolean expectedResult) {
        assertEquals(ContainsDuplicates.containsDuplicate(input), expectedResult);
    }
}
