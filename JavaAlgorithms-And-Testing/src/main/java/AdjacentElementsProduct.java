import static java.lang.Integer.MIN_VALUE;

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
}
