import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCommonCharacterCount {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {"aabcc", "adcaa", 3},
                {"abcdefghxyzttw", "hgfedcbaabcwwt", 10},
                {"aba", "bb", 1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testCommonCharacterCount(String s1, String s2, int expectedResult) {
        assertEquals(CommonCharacterCount.commonCharacterCount(s1, s2), expectedResult);
    }

}
