package com.israelmesa;

public class Main {

    public static void main(String[] args) {
//        int one = 7;
//        System.out.println(fibonacciNumber(one));

        int two = 5;
        System.out.println(fibonacciNumber(two));

    }

    public static int fibonacciNumber(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            System.out.println(n + ": " + (n - 1) + " + " + (n - 2) + " = " + ((n - 1) + (n - 2)));
            return fibonacciNumber(n - 1) + fibonacciNumber(n - 2);
        }
    }
}
