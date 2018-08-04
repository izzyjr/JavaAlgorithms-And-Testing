package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] testOne = {-1, 150, 190, 170, -1, -1, 160, -1};
        //Output: [-1, 150, 160, 170, -1, -1, 190, -1]

        int[] testTwo = {-1, -1, -1, -1, -1};
        //Output: [-1, -1, -1, -1, -1]

        int[] testThree = {4, 2, 9, 11, 2, 16};
        //Output: [2, 2, 4, 9, 11, 16]

        sortByHeight(testOne);

    }

    private static int[] sortByHeight(int[] a) {

        int temp;
        int increase = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = 0; j < a.length; j++) {

                if (j < (a.length - 1)) {

                    if (a[j + 1] == -1) {

                        while (a[j + increase] == -1 && (j + increase) < (a.length - 1)) {

                            increase++;

                        }

                        if (a[j] > a[j + increase] && a[j + increase] != -1) {

                            temp = a[j + increase];
                            a[j + increase] = a[j];
                            a[j] = temp;

                        }

                    } else  {

                        if (a[j] > a[j + 1]) {

                            temp = a[j + 1];
                            a[j + 1] = a[j];
                            a[j] = temp;

                        }

                    }

                }

                increase = 1;

            }

        }


        for (int j = 0; j < a.length; j++) {

            System.out.println(a[j]);

        }

        return a;

    }
}

























