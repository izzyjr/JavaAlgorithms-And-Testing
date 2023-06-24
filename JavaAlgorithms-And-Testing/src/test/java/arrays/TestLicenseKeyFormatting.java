package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestLicenseKeyFormatting {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"5F3Z-2e-9-w", 4, "5F3Z-2E9W"},
                {"2-5g-3-J", 2, "2-5G-3J"},
                {"2-4A0r7-4k", 3, "24-A0R-74K"}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testLicenseKeyFormatting(String s, int k, String expectedResult) {
        assertEquals(LicenseKeyFormatting.licenseKeyFormatting(s, k), expectedResult);
    }
}
