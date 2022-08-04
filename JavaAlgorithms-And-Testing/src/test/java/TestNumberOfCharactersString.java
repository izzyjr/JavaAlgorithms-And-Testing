import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNumberOfCharactersString {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"ffggHHsmmm", "f2g2h2s1m3"},
                {"ffggHHsmmmff", "f2g2h2s1m3f2"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testNumberOfCharactersString(String s, String expectedResult) {
        assertEquals(NumberOfCharactersString.numberOfCharactersString(s), expectedResult);
    }
}
