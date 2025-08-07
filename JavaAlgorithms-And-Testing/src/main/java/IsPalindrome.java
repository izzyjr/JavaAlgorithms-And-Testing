public class IsPalindrome {

    public static boolean isPalindrome(int number) {

        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int num = number;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse += lastDigit;
            reverse *= 10;
            num = num / 10;
        }

        return number == reverse / 10;
    }
}
