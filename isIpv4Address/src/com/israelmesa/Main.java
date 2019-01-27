package com.israelmesa;



public class Main {

    public static void main(String[] args) {

        // test 1 - true
        String inputStringOne = "172.16.254.1";

        // test 2 - false
        String inputStringTwo = "129380129831213981.255.255.255";

        // test 3 - false
        String inputStringThree = ".254.255.0";

        isIPv4Address(inputStringOne);

    }

    public static boolean isIPv4Address(String inputString) {

        String[] inputStringArray = inputString.split("[.]");
        int[] inputIntArray = new int[4];
        int counter = 0;

        if (isParseable(inputStringArray) && inputStringArray.length == 4) {

            for (int i = 0; i < inputStringArray.length; i++) {

                inputIntArray[i] = Integer.parseInt(inputStringArray[i]);

                if (inputIntArray[i] >= 0 && inputIntArray[i] <= 255) {

                    counter++;

                }

            }

            if (counter == 4) {

                return true;

            } else {

                return false;

            }

        }

        return false;

    }

    public static boolean isParseable(String[] strings) {

        String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int counterA = 0;
        int counterB = 0;

        for (int i = 0; i < strings.length; i++) {

            String[] temp = strings[i].split("");

            for (int j = 0; j < temp.length; j++) {

                if (temp.length <= 10) {

                    for (int x = 0; x < numbers.length; x++) {

                        if (temp[j].equals(numbers[x])) {

                            counterA++;
                            x = numbers.length;

                        }

                    }

                }

                if (counterA == temp.length) {

                    counterB++;

                }

            }

            counterA = 0;

        }

        if (counterB == strings.length) {

            return true;

        } else {

            return false;

        }

    }

}
