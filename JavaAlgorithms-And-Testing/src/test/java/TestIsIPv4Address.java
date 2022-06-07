import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestIsIPv4Address {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"192.168.0.1a", false},
                {"255.255.255.255", true},
                {"280.100.92.101", false},
                {"255.100.81.160.172", false},
                {"1..0.1", false},
                {"17.233.01.131", false}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testIPv4Address(String inputString, boolean expectedResult) {
        assertEquals(IsIPv4Address.isIPv4Address(inputString), expectedResult);
    }
}
