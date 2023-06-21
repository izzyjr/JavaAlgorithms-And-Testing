package hashtables;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestFindJudge {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {2, new int[][] {{1, 2}}, 2},
                {3, new int[][] {{1, 3}, {2, 3}}, 3},
                {3, new int[][] {{1, 3}, {2, 3}, {3, 1}}, -1},
                {4, new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}}, 3},
                {3, new int[][] {{1, 2}, {2, 3}}, -1}
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindJudge(int n, int[][] trust, int expectedResult) {
        assertEquals(FindJudge.findJudge(n, trust), expectedResult);
    }
}
