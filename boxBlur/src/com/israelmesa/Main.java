package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // TEST - 1
        // image:   [[1,1,1],
        //           [1,7,1],
        //           [1,1,1]]

        // expected output: [[1]]

        int[][] imageOne = {{1,1,1},
                            {1,7,1},
                            {1,1,1}};

        // TEST - 2
        //image:    [[0,18,9],
        //           [27,9,0],
        //           [81,63,45]]

        // expected output: [[28]]

        int[][] imageTwo = {{0,18,9},
                            {27,9,0},
                            {81,63,45}};

        // TEST - 3
        //image: [[36,0,18,9],
        //        [27,54,9,0],
        //        [81,63,72,45]]

        //Expected Output: [[40,30]]

        int[][] imageThree = {{36,0,18,9},
                              {27,54,9,0},
                              {81,63,72,45}};

        // TEST - 4
        //image: [[7,4,0,1],
        //        [5,6,2,2],
        //        [6,10,7,8],
        //        [1,4,2,0]]

        //Expected Output:[[5,4],
        //                 [4,4]]

        int[][] imageFour = {{7,4,0,1},
                             {5,6,2,2},
                             {6,10,7,8},
                             {1,4,2,0}};

        // TEST - 5
        //image: [[36,0,18,9,9,45,27],
        //        [27,0,54,9,0,63,90],
        //        [81,63,72,45,18,27,0],
        //        [0,0,9,81,27,18,45],
        //        [45,45,27,27,90,81,72],
        //        [45,18,9,0,9,18,45],
        //        [27,81,36,63,63,72,81]]

        //Expected Output:   [[39,30,26,25,31],
        //                    [34,37,35,32,32],
        //                    [38,41,44,46,42],
        //                    [22,24,31,39,45],
        //                    [37,34,36,47,59]]

        int[][] imageFive = {{36,0,18,9,9,45,27},
                             {27,0,54,9,0,63,90},
                             {81,63,72,45,18,27,0},
                             {0,0,9,81,27,18,45},
                             {45,45,27,27,90,81,72},
                             {45,18,9,0,9,18,45},
                             {27,81,36,63,63,72,81}};

    }

    public static int[][] boxBlur(int[][] image) {

        int rows = image.length;
        int columns = image[0].length;
        int[][] newImage = developNewDimenssions(image);

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < columns; j++) {

                if (image[i][j + 2] <= columns && image[i + 2][j] <= rows) {

                    

                }

            }

        }



        return image;
    }

    public static int[][] developNewDimenssions(int[][] image) {

        int [][] newImage;
        int array = image.length - 2;
        int arrayInArray = image[0].length - 2;

        newImage = new int[array][arrayInArray];

        return newImage;

    }

}
