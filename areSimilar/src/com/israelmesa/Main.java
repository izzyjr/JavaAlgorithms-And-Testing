package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1
        int[] oneA = {1, 2, 3};
        int[] oneB = {1, 2, 3};

        sameNumbers(oneA, oneB);




    }

    public static boolean areSimilar(int[] a, int[] b) {

        return false;
    }

    public static boolean sameNumbers(int[] a, int[] b) {

        int counter = 0;
        int arrayLength = a.length;

        for (int i = 0; i < arrayLength; i++) {

            for (int j = 0; j < arrayLength; j++) {

                if (a[i] == b[j]) {
                    counter++;
                    b[j] = 0;
                    j = arrayLength;

                }

            }

        }

        if (counter == arrayLength) {
            return true;
        }

        return false;
    }

}
