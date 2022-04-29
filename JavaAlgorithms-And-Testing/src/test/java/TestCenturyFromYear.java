import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCenturyFromYear {

    @Test(dataProvider = "yearAndCentury")
    private void testCenturyFromYear(int year, int expectedResult) {
        assertEquals(CenturyFromYear.centuryFromYear(year), expectedResult);
    }

    @DataProvider(name="yearAndCentury")
    private Object[][] getData() {
        return new Object[][]{{2001, 21}, {1988, 20}, {1700, 17}, {1499, 15}};
    }
}
