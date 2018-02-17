package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        shapeArea(1);
        shapeArea(2);
        shapeArea(3);
        shapeArea(4);
        shapeArea(5);

    }

    private static int shapeArea(int n) {
        int shapeArea = 1;
        for (int i = 0; i < n; i++) {
            shapeArea += (i * 4);
        }
        System.out.println("Shape Area of " + n + " is: " + shapeArea);
        return shapeArea;
    }
}
