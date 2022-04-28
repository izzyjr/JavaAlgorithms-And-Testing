package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int n = 239017;
        //return false

        isLucky(n);

        // isLucky2
        // true
        int ticketNumber1 = 123321;

        // true
        int ticketNumber2 = 12344321;

        // false
        int ticketNumber3 = 121344311;

        System.out.println(isLucky2(ticketNumber3));
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

    // If sum of first three digits equals sum of last three return True(lucky)
    public static boolean isLucky2(int ticketNumber) {

        String stringForm = Integer.toString(ticketNumber);
        String[] arrayOfNumbers = stringForm.split("");
        int length = arrayOfNumbers.length;

        int sumA = Integer.parseInt(arrayOfNumbers[0]) + Integer.parseInt(arrayOfNumbers[1]) + Integer.parseInt(arrayOfNumbers[2]);
        int sumB = Integer.parseInt(arrayOfNumbers[length -1]) + Integer.parseInt(arrayOfNumbers[length - 2]) + Integer.parseInt(arrayOfNumbers[length - 3]);

        return sumA == sumB;
    }
}

