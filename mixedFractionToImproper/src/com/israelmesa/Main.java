package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] one = {3, 1, 2};
        mixedFractionToImproper(one);

        int[] two = {3, 1, 3};
        mixedFractionToImproper(two);


    }

    public static int[] mixedFractionToImproper(int[] a) {

        int[] b = {a[1] + a[0] * a[2], a[2]};

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        return b;
    }
}
