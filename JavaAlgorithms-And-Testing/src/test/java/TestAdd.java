import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestAdd {

    @DataProvider(name="ValuesToAdd")
    private Object[][] getData() {
        return new Object[][]{{2, 3, 5}, {5, 5, 10}, {0, 0, 0}, {-2, 5, 3}};
    }

    @Test(dataProvider = "ValuesToAdd")
    private void testAdd(int x, int y, int expectedResult) {
        assertEquals(Add.add(x, y), expectedResult);
    }
}
