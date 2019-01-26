package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1 - 3
        int[] arrayOne = {2, 4, 1, 0};

        arrayMaximalAdjacentDifference(arrayOne);


    }

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {

        int length = inputArray.length;
        int maxDifference = 0;

        for (int i = 0; i < length; i++) {

            if ((i + 1) < length) {

                int a = inputArray[i] - inputArray[i + 1];
                int b = inputArray[i + 1] - inputArray[i];

                if (a > b) {

                    if (a > maxDifference) {

                        maxDifference = a;

                    }

                } else {

                    if (b > maxDifference) {

                        maxDifference = b;

                    }

                }

            }

        }

        System.out.println(maxDifference);
        return maxDifference;

    }

}
