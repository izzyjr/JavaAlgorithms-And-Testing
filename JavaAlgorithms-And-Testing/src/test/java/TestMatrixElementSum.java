import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestMatrixElementSum {

    @DataProvider(name="matrix")
    private Object[][] getData() {
        return new Object[][]{new int[][] {{1,1,1,0},
                                           {0,5,0,1},
                                           {2,1,3,10}}
        };
    }

    @Test(dataProvider = "matrix")
    private void testMatrixElementsSum(int[][] matrix) {
        assertEquals(MatrixElementsSum.matrixElementsSum(matrix), 9);
    }
}
