import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestBoxBlur {

    @DataProvider(name="imageAndResult")
    private Object[][] getData() {
        return new Object[][]{{new int[][] {{1, 1, 1},
                                           {1, 7, 1},
                                           {1, 1, 1}},
                               new int[][] {{1}}}
        };
    }

    @Test(dataProvider = "imageAndResult")
    private void testBoxBlur(int[][] image, int[][] expectedResult) {
        assertEquals(BoxBlur.boxBlur(image), expectedResult);
    }
}
