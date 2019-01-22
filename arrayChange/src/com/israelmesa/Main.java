package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test #1 - 13
        int[] arrayOne = {2, 3, 3, 5, 5, 5, 4, 12, 12, 10, 15};

        arrayChange(arrayOne);

    }

    public static int arrayChange(int[] inputArray) {

        int moveCounter = 0;

        for (int i = 0; (i + 1) < inputArray.length; i++) {

            while (inputArray[i + 1] <= inputArray[i]) {

                inputArray[i + 1] += 1;
                moveCounter++;

            }

        }

        return moveCounter;

    }

}
