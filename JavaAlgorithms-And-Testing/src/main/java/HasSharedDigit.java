public class HasSharedDigit {

    public static boolean hasSharedDigit(int a, int b) {

        int numA = a;

        if (a >= 10 && a <= 99 && b >= 10 && b <= 99) {
            while (numA > 0) {

                int numB = b;
                int lastDigitA = numA % 10;

                while (numB > 0) {

                    int lastDigitB = numB % 10;
                    if (lastDigitA == lastDigitB) {
                        return true;
                    }
                    numB = numB / 10;
                }

                numA = numA / 10;
            }
        }

        return false;
    }
}
