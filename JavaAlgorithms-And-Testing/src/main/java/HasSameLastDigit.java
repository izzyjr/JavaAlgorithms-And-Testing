public class HasSameLastDigit {

    public static boolean hasSameLastDigit(int a, int b, int c) {

        if (isValid(a) && isValid(b) && isValid(c)) {

            int rightMostA = a % 10;
            int rightMostB = b % 10;
            int rightMostC = c % 10;

            return rightMostA == rightMostB || rightMostB == rightMostC || rightMostC == rightMostA;
        }

        return false;
    }

    private static boolean isValid(int num) {
        return num >= 10 && num <= 1000;
    }
}
