package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] arrayOne = {2, 4, 7};
        System.out.println(isArithmeticProgression(arrayOne));

        int[] arrayTwo = {-7, -5, -3, -1};
        System.out.println(isArithmeticProgression(arrayTwo));
    }

    public static boolean isArithmeticProgression(int[] sequence) {

        int difference = sequence[1] - sequence[0];
        for (int i = 2; i < sequence.length; i++) {
            if (sequence[i] - sequence[i - 1] != difference) {
                return false;
            }
        }
        return true;
    }
}
