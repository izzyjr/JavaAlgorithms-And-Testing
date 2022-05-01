import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMakeArrayConsecutive2 {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {6, 2, 3, 8}, new int[] {3}},
                {new int[] {5, 4, 6}, new int[] {0}},
                {new int[] {8, 1, 0, 4, 7}, new int[] {4}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAdjacentElementsProduct(int[] statues, int[] expectedResult) {
        assertEquals(MakeArrayConsecutive2.makeArrayConsecutive2(statues), expectedResult[0]);
    }
}
