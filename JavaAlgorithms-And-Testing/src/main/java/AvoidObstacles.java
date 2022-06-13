import static sort.Sort.insertionSort;

public class AvoidObstacles {

    public static int avoidObstacles(int[] inputArray) {

        insertionSort(inputArray);
        int length = inputArray.length;
        int min = 1;
        int jump = 0;
        boolean complete = false;

        while (!complete) {
            ++min;
            jump = min;
            for (int i = 0; i < inputArray.length; i++) {
                while (jump < inputArray[i]) {
                    jump += min;
                    if (jump > inputArray[length - 1]) {
                        complete = true;
                        break;
                    }
                }
                if (jump > inputArray[i]) {
                    if (jump > inputArray[length - 1]) {
                        complete = true;
                    }
                } else {
                    break;
                }
            }
        }
        return min;
    }
}
