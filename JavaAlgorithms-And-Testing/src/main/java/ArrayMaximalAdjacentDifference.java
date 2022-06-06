public class ArrayMaximalAdjacentDifference {

    public static int arrayMaximalAdjacentDifference(int[] inputArray) {

        int max = 0;
        int compare = 0;
        int length = inputArray.length;

        for (int i = 0; i < length; i++) {
            if ((i + 1) < length) {
                if (inputArray[i] <= inputArray[i + 1]) {
                    compare = inputArray[i + 1] - inputArray[i];
                } else {
                    compare = inputArray[i] - inputArray[i + 1];
                }
                if (max <= compare) {
                    max = compare;
                }
            }
        }

        return max;
    }

    // first attempt solution
    public static int arrayMaximalAdjacentDifference0(int[] inputArray) {

        int length = inputArray.length;
        int maxDifference = 0;

        for (int i = 0; i < length; i++) {
            if ((i + 1) < length) {
                int a = inputArray[i] - inputArray[i + 1];
                int b = inputArray[i + 1] - inputArray[i];
                if (a > b) {
                    if (a > maxDifference) {
                        maxDifference = a;
                    }
                } else {
                    if (b > maxDifference) {
                        maxDifference = b;
                    }
                }
            }
        }

        return maxDifference;
    }
}
