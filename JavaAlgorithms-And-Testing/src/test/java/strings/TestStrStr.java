package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestStrStr {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"sst", "st", 1},
                {"CodefightsIsAwesome", "IsA", 10},
                {"aBcDefghaBcdEFgh", "ghb", -1},
                {"ATErUUeUkVFVNfxfUKtntOErKmZLUpWpHRASdxjUhzzxygmnNnKabPPgPqyvCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKapBlrd",
                        "vCLSCZObaNNGCXQssfEEDDJIPBwtkMmTniKa", 59}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testStrStr(String s, String x, int expectedResult) {
        assertEquals(StrStr.strStr(s, x), expectedResult);
    }
}
