public class LargestPrime {

    public static int largestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        int largestPrime = 0;

        for (int i = 2; i <= number; i++) {

            int count  = 0;

            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {

                if (number % i == 0) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}
