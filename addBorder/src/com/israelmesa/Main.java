package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        String[] pictureOne = {"abc", "ded"};
        //Output: ["*****","*abc*","*ded*","*****"]

        String[] pictureTwo = {"a"};
        //Output: "***", "*a*", "***"

        String[] pictureThree = {"aa", "**", "zz"};
        //Output: "****","*aa*","****","*zz*","****"

        String[] pictureFour = {"wzy**"};
        //Output: "*******", "*wzy***","*******"

        addBorder(pictureOne);

    }

    private static String[] addBorder(String[] picture) {

        int newArraySize = picture.length + 2;
        String[] framedPicture = new String[newArraySize];
        int stringLength = picture[0].length() + 2;
        int orginalArrayLengthCounter = 0;

        for (int i = 0; i < framedPicture.length; i++) {

            if (i == 0 || i == framedPicture.length - 1) {
                String topBottom = "*****";
                framedPicture[i] = topBottom;
            } else {
                framedPicture[i] = picture[orginalArrayLengthCounter];
                orginalArrayLengthCounter++;
            }

        }

        printPicture(framedPicture);

        return framedPicture;

    }

    private static void printPicture(String[] framedPicture) {

        for (int i = 0; i < framedPicture.length; i++) {
            System.out.println("\n" + framedPicture[i]);
        }

    }

}
