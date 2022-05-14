package arrays;

public class RotateImage {

    public static int[][] rotateImage(int[][] a) {

        int colsLength = a[0].length;
        int rowsLength = a.length;
        int[][] result = new int[colsLength][rowsLength];
        int j = 0;

        for (int rows = rowsLength - 1; rows >= 0; rows--) {
            for (int cols = 0; cols < colsLength; cols++) {
                result[cols][j] = a[rows][cols];
            }
            j++;
        }
        return result;
    }
}

