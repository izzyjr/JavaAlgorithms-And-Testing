package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        checkPalindrome("wow");
        System.out.println("...........");
        checkPalindrome("madam");
        System.out.println("...........");
        checkPalindrome("futbol");
    }

    private static boolean checkPalindrome(String inputString) {
        int length = inputString.length();
        int countDown = (inputString.length() - 1);
        int count = 0;
        String[] array = inputString.split("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +  " : " + array[countDown]);
            if(array[i].equals(array[countDown])) {
                countDown--;
                count++;
            }
        }
        if(count == length){
            System.out.println("Palindrome: " + count + " of " + length);
            return true;
        } else {
            System.out.println("Not a Palindrome " + count + " of " + length );
            return false;
        }
    }
}
