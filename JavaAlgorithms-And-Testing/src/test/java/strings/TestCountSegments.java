package strings;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestCountSegments {

    @DataProvider(name="stringsAndResult")
    private Object[][] getData() {
        return new Object[][]{
                {"Hello, my name is John", 5},
                {"Hello", 1},
                {"A segment is defined to be a contiguous sequence of non-space characters", 12},
                {"", 0},
                {", , , ,        a, eaefa", 6},
                {"    foo    bar", 2},
        };
    }

    @Test(dataProvider = "stringsAndResult")
    private void testCountSegments(String address, int expectedResult) {
        assertEquals(CountSegments.countSegments(address), expectedResult);
    }
}
