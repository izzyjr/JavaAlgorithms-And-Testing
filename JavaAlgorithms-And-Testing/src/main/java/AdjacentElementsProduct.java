public class AdjacentElementsProduct {

    public static int adjacentElementsProduct(int[] inputArray) {

        int largest = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            if (inputArray[i] * inputArray[i + 1] > largest) {
                largest = inputArray[i] * inputArray[i + 1];
            }
        }
        return largest;
    }

    public static int adjacentElementsProduct0(int[] inputArray) {
        int[] largeProducts = new int[inputArray.length - 1];
        int countDown = inputArray.length - 2;
        for (int i = 0; i < inputArray.length; i++) {
            if (i < inputArray.length){
                if (i <= countDown) {
                    largeProducts[i] = inputArray[i] * inputArray[i + 1];
                }
            }
        }
        int largest = largeProducts[0];
        for (int j = 0; j < largeProducts.length; j++) {
            if (largest < largeProducts[j]){
                largest = largeProducts[j];
            }
        }
        return largest;
    }
}
