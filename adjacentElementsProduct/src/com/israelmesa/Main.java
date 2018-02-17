package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {-23, 4, -3, 8, -12};
        adjacentElementsProduct(numbers);

    }
    private static int adjacentElementsProduct(int[] inputArray) {
        int[] largeProducts = new int[inputArray.length - 1];
        int countDown = inputArray.length - 2;
        for (int i = 0; i < inputArray.length; i++) {
            if (i < inputArray.length){
                if (i <= countDown) {
                    largeProducts[i] = inputArray[i] * inputArray[i + 1];
                }
            }
        }
        for (int j = 0; j < largeProducts.length; j++) {
            System.out.println(largeProducts[j]);
        }
        int largest = largeProducts[0];
        for (int j = 0; j < largeProducts.length; j++) {
            if (largest < largeProducts[j]){
                largest = largeProducts[j];
            }
        }
        System.out.println("Largest: " + largest);
        return largest;
    }
}
