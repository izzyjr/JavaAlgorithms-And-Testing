public class GetEvenDigitSum {

    public static int getEvenDigitSum(int number) {

        if (number < 0) {
            return -1;
        }

        int sum = 0;

        while (number > 0) {

            int lastNumber = number % 10;

            if (lastNumber % 2 == 0) {
                sum += lastNumber;
            }
            number /= 10;
        }

        return sum;
    }
}
