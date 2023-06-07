import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestOnTheHunt {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"abcde", List.of("a", "b", "c"), "a,b,c,d", "abc"},
                {"edcba", List.of("c", "b", "a"), "d,c,b,a", "abc"},
                {"c", List.of("c", "b"), "c,b,a", "c"},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testOnTheHunt(String s, List<String> arr, String csv, String expectedResult) {
        assertEquals(OnTheHunt.onTheHunt(s, arr, csv), expectedResult);
    }
}
