package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestPossibleSums {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {10, 50, 100}, new int[] {1, 2, 1}, 9},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testPossibleSums(int[] coins, int[] quantity, int expectedResult) {
        assertEquals(PossibleSums.possibleSums(coins, quantity), expectedResult);
    }
}
