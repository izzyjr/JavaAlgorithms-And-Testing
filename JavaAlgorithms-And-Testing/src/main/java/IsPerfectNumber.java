public class IsPerfectNumber {

    public static boolean isPerfectNumber(int number) {

        if (number < 1) {
            return false;
        }

        int divisorsTotalSum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                divisorsTotalSum += i;
            }
        }

        return divisorsTotalSum == number;
    }
}
