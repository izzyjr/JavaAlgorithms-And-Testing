package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestDefangIPAddress {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"255.100.50.0", "255[.]100[.]50[.]0"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testDefangIPAddress(String address, String expectedResult) {
        assertEquals(DefangIPAddress.defangIPAddress(address), expectedResult);
    }
}
