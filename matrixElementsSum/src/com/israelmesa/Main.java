package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{0,1,1,2},
                          {0,5,0,0},
                          {2,0,3,3}};
        matrixElementsSum(matrix);

    }

    public static void matrixElementsSum(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.println(matrix[i][j]);
            }
        }
    }
}
