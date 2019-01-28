package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1 = 4
        int[] arrayOne = {5, 3, 6, 7, 9};

        // test 2 = 6
        int[] arrayTwo = {1000, 999};

        // test 3 = 6
        int[] arrayThree = {5, 8, 9, 13, 14};

        // test 4 = 3
        int[] arrayFour = {19, 32, 11, 23};

        // test 5 = 7
        int[] arrayFive = {1, 4, 10, 6, 2};

        avoidObstacles(arrayFive);

    }

    public static int avoidObstacles(int[] inputArray) {

        int commonNumber = 2;
        int counter = 0;
        boolean flag = false;

        while(!flag) {

            for (int i = 0; i < inputArray.length; i++) {

                if (inputArray[i] % commonNumber != 0) {

                    counter++;

                }

            }

            if (counter == inputArray.length) {

                flag = true;

            } else {

                counter = 0;
                commonNumber++;

            }

        }

        return commonNumber;
        
    }

}
