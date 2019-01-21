package com.israelmesa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // test 1 - false
        int[] oneA = {1, 2, 2};
        int[] oneB = {2, 1, 1};

        // test 2 - false
        int[] twoA = {4, 6, 3};
        int[] twoB = {3, 4, 6,};

        // test 3 - true
        int[] threeA = {1, 2, 3};
        int[] threeB = {1, 2, 3};

        // test 4 - true
        int[] fourA = {1, 2, 3};
        int[] fourB = {2, 1, 3};

        areSimilar(fourA, fourB);

    }

    public static boolean areSimilar(int[] a, int[] b) {

        int arrayLength = a.length;
        int counter = 0;
        int[] realA = Arrays.copyOf(a, a.length);
        int[] realB = Arrays.copyOf(b, b.length);

        if (sameNumbers(a, b)) {

            for (int i = 0; i < arrayLength; i++) {

                if (realA[i] != realB[i]) {

                    counter++;

                }

            }

            if (counter > 2) {

                return false;

            }

            return true;

        }

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
