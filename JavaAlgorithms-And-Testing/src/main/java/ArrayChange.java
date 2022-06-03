public class ArrayChange {

    public static int arrayChange(int[] inputArray) {

        int length = inputArray.length;
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (i < length - 1) {
                while (inputArray[i] >= inputArray[i + 1]) {
                    inputArray[i + 1]++;
                    count++;
                }
            }
        }
        return count;
    }
}
