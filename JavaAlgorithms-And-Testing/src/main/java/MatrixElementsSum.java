public class MatrixElementsSum {

    public static int matrixElementsSum(int[][] matrix) {

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

    // first attempt solution
    public static int matrixElementsSum0(int[][] matrix) {
        int count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row < matrix.length - 1) {
                    if (matrix[row][column] == 0) {
                        matrix[matrix.length - 1][column] = 0;
                        for (int i = row; i < matrix[row].length - 1; i++) {
                            matrix[i][column] = 0;
                        }
                    }
                }
                count += matrix[row][column];
            }
        }
        return count;
    }
}
