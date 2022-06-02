import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAreSimilar {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {1, 2, 3}, new int[] {1, 2, 3}, true},
                {new int[] {1, 2, 3}, new int[] {2, 1, 3}, true},
                {new int[] {2, 3, 1}, new int[] {1, 3, 2}, true},
                {new int[] {1, 2, 3}, new int[] {1, 10, 2}, false},
                {new int[] {832, 998, 148, 570, 533, 561, 894, 147, 455, 279}, new int[] {832, 998, 148, 570, 533, 561, 455, 147, 894, 279}, true},
                {new int[] {2, 3, 9}, new int[] {10, 3, 2}, false},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAreSimilar(int[] a, int[] b, boolean expectedResult) {
        assertEquals(AreSimilar.areSimilar(a, b), expectedResult);
    }
}
