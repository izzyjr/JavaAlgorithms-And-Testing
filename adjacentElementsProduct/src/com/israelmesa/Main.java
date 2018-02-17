package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        adjacentElementsProduct(numbers);

    }
    private static int[] adjacentElementsProduct(int[] inputArray) {
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
        return largeProducts;
    }
}
