package arrays;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRotateImage {

    @DataProvider(name="matrix")
    private Object[][] getData() {
        return new Object[][]{new int[][] {{1, 2, 3},
                                           {4, 5, 6},
                                           {7, 8, 9}}
        };
    }

    @Test(dataProvider = "matrix")
    private void testRotateImage(int[][] a) {

        int[][] expectedResult = new int[][] {{7, 4, 1},
                {8, 5, 2},
                {9, 6, 3}};

        assertEquals(RotateImage.rotateImage(a), expectedResult);
    }
}
