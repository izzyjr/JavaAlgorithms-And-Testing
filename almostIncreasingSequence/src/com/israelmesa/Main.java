package com.israelmesa;

public class Main {

    public static void main(String[] args) {
//        int[] numArray = {1, 2, 18, 3, 4};
//        System.out.println(almostIncreasingSequence(numArray));

//        int[] numArrayTwo = {40, 50, 60, 10, 20, 30};
//        System.out.println(almostIncreasingSequence(numArrayTwo));
//
        int[] numArrayThree = {1, 2, 5, 3, 5};
        System.out.println(almostIncreasingSequence(numArrayThree));
//
//        int[] numArrayFour = {10, 1, 2, 3, 4, 5, 6, 1};
//        System.out.println(almostIncreasingSequence(numArrayFour));

    }

    private static boolean almostIncreasingSequence(int[] sequence) {

        int length = sequence.length - 1;
        int skip;
        int increase = 0;
        int pass = 0;
        for (int i = 0; i < length; i++) {
            skip = sequence[i];
            for (int j = 0; j < length; j++) {
                if (skip == sequence[j]) {
                    System.out.println("skip");
                } else {
                    if (sequence[j + 1] == skip) {
                        if (j <= length - 1){
                            if (sequence[j] < sequence[j + 2]) {
                                increase++;
                            }
                        }
                    } else {
                        if (sequence[j] < sequence[j + 1]) {
                            increase++;
                        }
                    }
                }
                if (increase == length - 1) {
                    pass++;
                }
            }
        }
        if (pass == length) {
            return true;
        } else {
            return false;
        }
    }

//    private static boolean almostIncreasingSequence(int[] sequence) {
//        int length = sequence.length - 1;
//        int fail = 0;
//        int pass = 0;
//        for (int i = 1; i < length; i++) {
//            if (sequence[i] > sequence[i - 1] && sequence[i + 1] > sequence[i - 1] ) {
//                pass++;
//            } else {
//                fail++;
//            }
//        }
//        System.out.println("pass: " + pass + " fail: " + fail);
//        if (pass == length - 2 && fail <= 1) {
//            return true;
//        } else {
//            return false;
//        }
//    }

//    private static boolean almostIncreasingSequence(int[] sequence) {
//        int increase = 0;
//        int decrease = 0;
//        int increment = sequence.length - 1;
//        for (int i = 0; i < increment; i++) {
//            if (sequence[i] < sequence[i + 1]) {
//                increase++;
//                System.out.println(sequence[i] + " : " + sequence[i + 1] + " - " +  "Increase: " + increase);
//            } else {
//                decrease++;
//                System.out.println(sequence[i] + " : " + sequence[i + 1] + " - " + "Decrease: " + decrease);
//            }
//        }
//        if (increase == increment || decrease <= 1) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
