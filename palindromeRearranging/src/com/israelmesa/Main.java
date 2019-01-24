package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1 - true
        String one = "aabb";

        // test 2 - true
        String two = "abbabb";


        palindromeRearranging(two);


    }

    public static boolean palindromeRearranging(String inputString) {

        int stringLength = inputString.length();
        int pairCounter = 0;
        String newString = inputString;



        for(int i = 0; i < stringLength; i++) {

            for (int j = 0; j < stringLength; j++) {

                if (i != j) {

                    System.out.println(inputString.charAt(i) == inputString.charAt(j));
                    System.out.println(inputString.charAt(i) + " - " + inputString.charAt(j));

                    if (inputString.charAt(i) == newString.charAt(j)) {

                        newString = inputString.replace(newString.charAt(j), '*');
                        pairCounter++;

                    }

                }

            }

        }

        System.out.println("Counter: " + pairCounter);

        if (isEven(stringLength)) {

            if (pairCounter == stringLength) {
                System.out.println("True");
                return true;
            }

        } else {

            if (pairCounter == stringLength) {
                System.out.println("True");
                return true;
            }

        }

        System.out.println("False");
        return false;

    }

    public static boolean isEven(int stringLength) {

        if (stringLength % 2 == 0) {

            return true;

        }

        return false;

    }


}
