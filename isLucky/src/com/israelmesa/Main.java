package com.israelmesa;

public class Main {

    public static void main(String[] args) {

//        int n = 1230;
        //returns true

        int n = 239017;
        //return false

        isLucky(n);

    }

    private static boolean isLucky(int n) {

        int teamA = 0;
        int teamB = 0;
        String numberString = String.valueOf(n);
        String numberArray[] = numberString.split("");

        int splitLength = (numberString.length() / 2);

        for (int i = 0; i < numberArray.length; i++) {

            if (i < splitLength) {

                teamA += Integer.parseInt(numberArray[i]);

            } else {

                teamB += Integer.parseInt(numberArray[i]);

            }

        }

        if (teamA == teamB) {

            return true;

        }

        return false;

    }


//    private static boolean isLucky(int n) {
//
//        int teamA = 0;
//        int teamB = 0;
//        String numberString = String.valueOf(n);
//        String numberArray[] = numberString.split("");
//
//        int splitLength = (numberString.length() / 2);
//
//        for (int i = 0; i < numberArray.length; i++) {
//
//            if (i < splitLength) {
//
//                teamA += Integer.parseInt(numberArray[i]);
//
//            } else {
//
//                teamB += Integer.parseInt(numberArray[i]);
//
//            }
//
//        }
//
//        System.out.println("TeamA: " + teamA + " - " + "TeamB: " + teamB);
//
//        if (teamA == teamB) {
//
//            System.out.println("True");
//            return true;
//
//        }
//
//        System.out.println("False");
//        return false;
//
//    }

}

