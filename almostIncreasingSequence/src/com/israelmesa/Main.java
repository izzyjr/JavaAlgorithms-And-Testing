package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 3, 5, 6};
        System.out.println(almostIncreasingSequence(numArray));

    }

    private static boolean almostIncreasingSequence(int[] sequence) {
        int increase = 0;
        int decrease = 0;
        int increment = sequence.length - 1;
        for (int i = 0; i < increment; i++) {
            if (sequence[i] < sequence[i + 1]) {
                increase++;
                System.out.println(sequence[i] + " : " + sequence[i + 1] + " - " +  "Increase: " + increase);
            } else {
                decrease++;
                System.out.println(sequence[i] + " : " + sequence[i + 1] + " - " + "Decrease: " + decrease);
            }
        }
        if (increase == increment || decrease <= 1) {
            return true;
        } else {
            return false;
        }
    }
}
