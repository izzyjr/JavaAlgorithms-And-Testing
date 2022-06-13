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

    // first attempt solution
    public static int avoidObstacles0(int[] inputArray) {

        int commonNumber = 2;
        int counter = 0;
        boolean flag = false;

        while(!flag) {

            for (int i = 0; i < inputArray.length; i++) {
                if (inputArray[i] % commonNumber != 0) {
                    counter++;
                }
            }

            if (counter == inputArray.length) {
                flag = true;
            } else {
                counter = 0;
                commonNumber++;
            }
        }
        return commonNumber;
    }
}
