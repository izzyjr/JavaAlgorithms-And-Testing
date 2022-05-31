import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAlternatingSums {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {50, 60, 60, 45, 70}, new int[] {180, 105}},
                {new int[] {100, 50}, new int[] {100, 50}},
                {new int[] {100, 51, 50, 100}, new int[] {150, 151}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAlternatingSums(int[] a, int[] expectedResult) {
        assertEquals(AlternatingSums.alternatingSums(a), expectedResult);
    }
}
