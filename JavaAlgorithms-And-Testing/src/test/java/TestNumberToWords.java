import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNumberToWords {

    @DataProvider(name = "inputOutput")
    public Object[][] getData() {
        return new Object[][]{
                {123, "One, Two, Three."},
                {1010, "One, Zero, One, Zero."},
                {1000, "One, Zero, Zero, Zero."},
                {-12, "Invalid Value."},
                {17, "One, Seven."},
                {0, "Zero."}
        };
    }

    @Test(dataProvider = "inputOutput")
    public void testNumberToWords(int number, String expectedResult) {
        assertEquals(NumberToWords.numberToWords(number), expectedResult);
    }
}
