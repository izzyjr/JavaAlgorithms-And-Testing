package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestReverseArray {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new char[] {'h', 'e', 'l', 'l', 'o'}, new char[] {'o', 'l', 'l', 'e', 'h'}},
                {new char[] {'h', 'a', 'n', 'n', 'a', 'h'}, new char[] {'h', 'a', 'n', 'n', 'a', 'h'}},
                {new char[] {'r', 'a', 'c', 'e', 'c', 'a', 'r'}, new char[] {'r', 'a', 'c', 'e', 'c', 'a', 'r'}}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testReverseArray(char[] s, char[] expectedResult) {
        assertEquals(ReverseArray.reverseArray(s), expectedResult);
    }
}
