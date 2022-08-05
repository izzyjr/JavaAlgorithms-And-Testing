import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestNumberOfCharactersString {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"ffgghhsmmm", "f2g2h2s1m3"},
                {"ffgghhsmmmff", "f2g2h2s1m3f2"},
                {"ffggHHsmmmff", "f2g2H2s1m3f2"}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testNumberOfCharactersString(String s, String expectedResult) {
        assertEquals(NumberOfCharactersString.numberOfCharactersString(s), expectedResult);
    }
}
