public class GreatestCommonDivisor {

    public static int greatestCommonDivisor(int first, int second) {

        if (first < 10 || second < 10) {
            return -1;
        }

        if (first >= second) {
            for (int i = first; first > 0; i--) {
                if (first % i == 0 && second % i == 0) {
                    return i;
                }
            }
        } else {
            for (int j = second; second > 0; j--) {
                if (first % j == 0 && second % j == 0) {
                    return j;
                }
            }
        }

        return 0;
    }
}
