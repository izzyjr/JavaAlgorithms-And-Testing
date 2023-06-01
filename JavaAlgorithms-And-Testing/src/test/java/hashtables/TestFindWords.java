package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestFindWords {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new String[] {"Hello", "Alaska", "Dad", "Peace"}, List.of("Alaska", "Dad")},
                {new String[] {"omk"}, List.of()},
                {new String[] {"Dash", "Hash", "Last", "Reporter"}, List.of("Reporter", "Dash", "Hash")}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindWords(String[] words, List<String> expectedResult) {
        assertEquals(FindWords.findWords(words), expectedResult);
    }
}
