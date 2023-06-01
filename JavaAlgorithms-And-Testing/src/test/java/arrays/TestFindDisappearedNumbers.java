package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class TestFindDisappearedNumbers {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {new int[] {4, 3, 2, 7, 8, 2, 3, 1}, List.of(5, 6)},
                {new int[] {1, 1}, List.of(2)},
                {new int[] {1, 1, 1}, List.of(2, 3)},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testFindDisappearedNumbers(int[] input, List<Integer> expectedResult) {
        assertEquals(FindDisappearedNumbers.findDisappearedNumbers(input), expectedResult);
    }
}
