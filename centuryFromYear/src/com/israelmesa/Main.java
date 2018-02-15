package com.israelmesa;

public class Main {

    public static void main(String[] args) {
        System.out.println("Century: " + centuryFromYear(2018));

    }
    private static int centuryFromYear(int year) {
        if (year > 100) {
            int century = year/100;
            int stepTwo = century * 100;
            int stepThree = year - stepTwo;
            if (stepThree >= 1) {
                return century + 1;
            } else {
                return century;
            }
        }
        return 1;
    }
}
