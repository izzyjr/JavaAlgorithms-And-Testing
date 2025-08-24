import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLargestPrime {

    @DataProvider(name = "inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {21, 7},
                {31, 31},
                {0, -1},
                {5, 5},
                {-1, -1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testLargestPrime(int input, int expectedResult) {
        assertEquals(LargestPrime.largestPrime(input), expectedResult);
    }
}
