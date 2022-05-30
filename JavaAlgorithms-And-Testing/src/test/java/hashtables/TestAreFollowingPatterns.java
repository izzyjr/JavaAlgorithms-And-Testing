package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestAreFollowingPatterns {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"cat", "dog", "dog"}, new String[] {"a", "b", "b"}, true},
                {new String[] {"cat", "dog", "doggy"}, new String[] {"a", "b", "b"}, false},
                {new String[] {"aaa"}, new String[] {"aaa"}, true}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testAreFollowingPatterns(String[] strings, String[] patterns, boolean expectedResult) {
        assertEquals(AreFollowingPatterns.areFollowingPatterns(strings, patterns), expectedResult);
    }
}
