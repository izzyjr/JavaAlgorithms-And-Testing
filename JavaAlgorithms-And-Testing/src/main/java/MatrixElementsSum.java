public class MatrixElementsSum {

    public static int matrixElementSum(int[][] matrix) {

        int rowsLength = matrix.length;
        int columnsLength = matrix[0].length;
        int totalPrice = 0;

        for (int cols = 0; cols < columnsLength; cols++) {
            for (int rows = 0; rows < rowsLength; rows++) {
                if (matrix[rows][cols] == 0) {
                    rows = rowsLength - 1;
                } else {
                    totalPrice += matrix[rows][cols];
                }
            }
        }
        return totalPrice;
    }
}
