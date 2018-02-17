package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] statues = {6, 3, 2, 8};
        makeArrayConsecutive2(statues);

    }

    private static int makeArrayConsecutive2(int[] statues) {
        if (statues.length == 1) {
            return 0;
        }
        int largestNum = statues[0];
        int smallestNum = statues[0];
        for (int i = 0; i < statues.length; i++) {
            if (largestNum <= statues[i]) {
                largestNum = statues[i];
            }
            if (smallestNum >= statues[i]) {
                smallestNum = statues[i];
            }
        }
        int countUp = smallestNum;
        int there = 0;
        for (int j = 0; j < statues.length; j++) {
            countUp++;
            for (int k = 0; k < statues.length; k++) {
                if (countUp < largestNum) {
                    if (countUp == statues[k]) {
                        there++;
                    }
                }
            }
        }
        int count = (largestNum - (smallestNum + 1)) - there;
        System.out.println("Number of statues missing: " + count);
        return count;
    }
}
