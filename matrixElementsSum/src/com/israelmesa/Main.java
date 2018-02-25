package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{1,0,1,0,1},
                          {0,0,0,0,0},
                          {2,1,3,10,0},
                          {2,1,3,10,2},
                          {2,1,3,10,2}};

        System.out.println(matrixElementsSum(matrix));

    }

    public static int matrixElementsSum(int[][] matrix) {
        int count = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (row < matrix.length - 1) {
                    if (matrix[row][column] == 0) {
                        for (int i = row; i <= matrix[row].length - 1; i++) {
                            matrix[i][column] = 0;
                        }
                    }
                }
//                count += matrix[row][column];
            }
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                count += matrix[row][column];
                System.out.print(matrix[row][column] + "\t");
            }
            System.out.println("\n");
        }
        return count;
    }
}
