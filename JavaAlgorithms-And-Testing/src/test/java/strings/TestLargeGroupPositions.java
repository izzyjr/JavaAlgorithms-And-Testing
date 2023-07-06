package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestLargeGroupPositions {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"abbxxxxzzy", List.of(List.of(3, 6))},
                {"abc", List.of()},
                {"abcdddeeeeaabbbcd", List.of(List.of(3, 5), List.of(6, 9), List.of(12, 14))}
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testLargeGroupPositions(String s, List<List<Integer>> expectedResult) {
        assertEquals(LargeGroupPositions.largeGroupPositions(s), expectedResult);
    }
}
