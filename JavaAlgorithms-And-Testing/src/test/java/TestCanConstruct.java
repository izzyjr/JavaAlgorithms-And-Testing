import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCanConstruct {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"a", "b", false},
                {"aa", "ab", false},
                {"aa", "aab", true},
                {"aab", "baa", true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCanConstruct(String ransomNote, String magazine, boolean expectedResult) {
        assertEquals(CanConstruct.canConstruct(ransomNote, magazine), expectedResult);
    }
}
