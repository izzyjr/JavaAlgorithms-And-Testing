import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TestAdd {

    private final Add algorithm = new Add();

    @Test(dataProvider = "ValuesToAdd")
    private void testAdd(int x, int y, int expectedResult) {
        assertEquals(algorithm.add(x, y), expectedResult);
    }

    @DataProvider(name="ValuesToAdd")
    private Object[][] getData() {
        return new Object[][]{{2, 3, 5}, {5, 5, 10}, {0, 0, 0}, {-2, 5, 3}};
    }

}
