package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1 - true
        String one = "aabb";

        // test 2 - true
        String two = "abbcabb";

        // test 3 - false
        String three = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa";


        palindromeRearranging(three);


    }

    public static boolean palindromeRearranging(String inputString) {

        int pairCounter = 0;
        String[] stringArrayOne = inputString.split("");
        String[] stringArrayTwo = inputString.split("");
        int arrayLength = stringArrayOne.length;

        for(int i = 0; i < arrayLength; i++) {

            for (int j = 0; j < arrayLength; j++) {

                if (i != j) {

                    if (stringArrayOne[i].equals(stringArrayTwo[j])) {

                        pairCounter++;
                        stringArrayTwo[j] = "*";
                        j = arrayLength;

                    }

                }

            }

        }

        if (isEven(arrayLength)) {

            if (pairCounter == arrayLength) {
                return true;
            }

        } else {

            if (pairCounter == arrayLength - 1) {
                return true;
            }

        }

        return false;

    }

    public static boolean isEven(int stringLength) {

        if (stringLength % 2 == 0) {

            return true;

        }

        return false;

    }


}
