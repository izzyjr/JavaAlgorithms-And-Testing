package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        String[] arrayOne = {"aba", "aa", "ad", "vcd", "aba"};

        allLongestStrings(arrayOne);

    }

    private static String[] allLongestStrings(String[] inputArray) {

        int max = 0;
        int count = 0;
        int countUp = 0;
        String[] allLongestStrings;

        for (int i = 0; i < inputArray.length; i++) {

            if (inputArray[i].length() > max) {

                max  = inputArray[i].length();

            }

        }

        for (int j = 0; j < inputArray.length; j++) {

            if (inputArray[j].length() ==  max) {

                count++;

            }

        }

        System.out.println("Max: " + max);
        System.out.println("Count: " + count);
        allLongestStrings = new String[count];

        for (int k = 0; k < inputArray.length; k++) {

            if (inputArray[k].length() ==  max) {

                if (countUp < count) {

                    allLongestStrings[countUp] = inputArray[k];
                    System.out.println((countUp + 1) + ": " + inputArray[k]);
                    countUp++;

                }

            }

        }

        return allLongestStrings;
    }

}
