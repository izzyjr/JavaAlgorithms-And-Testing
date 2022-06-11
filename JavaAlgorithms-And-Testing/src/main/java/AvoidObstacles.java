import static sort.Sort.insertionSort;

public class AvoidObstacles {

    public static int avoidObstacles(int[] inputArray) {

        insertionSort(inputArray);
        int length = inputArray.length;
        int min = 1;
        int jump = 0;
        boolean flag = false;

        while (!flag) {
            ++min;
            jump = min;
            for (int i = 0; i < inputArray.length; i++) {
                if (jump < inputArray[i]) {
                    jump += min;
                    if (jump > inputArray[length - 1]) {
                        flag = true;
                    }
                } else if (jump > inputArray[i]) {
                    if (jump > inputArray[length - 1]) {
                        flag = true;
                    }
                } else {
                    break;
                }
            }
        }
        return min;
    }
}
