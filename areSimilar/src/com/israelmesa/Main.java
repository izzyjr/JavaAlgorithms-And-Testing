package com.israelmesa;

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

        // test 5 - true
        int[] fiveA = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] fiveB = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};

        areSimilar(fiveA, fiveB);

    }

    public static boolean areSimilar(int[] a, int[] b) {

        int sumA = 0;
        int sumB = 0;
        int sameCounter = 0;
        int parallelCounter = 0;
        int arrayLength = a.length;

        for (int i = 0; i < arrayLength; i++) {

            sumA += a[i];
            sumB += b[i];

            if (a[i] != b[i]) {

                parallelCounter++;

            }

            for (int j = 0; j < arrayLength; j++) {

                if (a[i] == b[j]) {

                    sameCounter++;
                    j = arrayLength;

                }

            }

        }

        if (sameCounter == arrayLength && parallelCounter <= 2 && sumA == sumB) {
            return true;
        }

        return false;
    }

}
