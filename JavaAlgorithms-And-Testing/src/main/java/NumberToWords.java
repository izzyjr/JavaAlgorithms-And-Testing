public class NumberToWords {

    public static String numberToWords(int number) {

        StringBuilder numberToWords = new StringBuilder();

        if (number < 0) {
            numberToWords.append("Invalid Value");
        } else if (number == 0) {
            numberToWords.append("Zero");
        }

        int count = getDigitCount(number);
        number = reverse(number);
        int reversedCount = getDigitCount(number);

        while(number > 0) {

            int lastDigit = number % 10;

            switch(lastDigit) {
                case 0:
                    numberToWords.append("Zero");
                    break;
                case 1:
                    numberToWords.append("One");
                    break;
                case 2:
                    numberToWords.append("Two");
                    break;
                case 3:
                    numberToWords.append("Three");
                    break;
                case 4:
                    numberToWords.append("Four");
                    break;
                case 5:
                    numberToWords.append("Five");
                    break;
                case 6:
                    numberToWords.append("Six");
                    break;
                case 7:
                    numberToWords.append("Seven");
                    break;
                case 8:
                    numberToWords.append("Eight");
                    break;
                case 9:
                    numberToWords.append("Nine");
                    break;
            }

            number = number / 10;

            if (number > 0) {
                numberToWords.append(", ");
            }
        }

        if (count > reversedCount) {
            for (int i = 0; i < count - reversedCount; i++) {
                numberToWords.append(", Zero");
            }
        }

        return numberToWords.append(".").toString();
    }

    private static int reverse(int number) {

        int reversed = 0;

        while (number > 9) {
            int lastDigit = number % 10;
            reversed += lastDigit;
            reversed *= 10;
            number /= 10;
        }

        reversed += number;

        return reversed;
    }

    private static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        int count = 0;

        while (number > 0) {
            count++;
            number /= 10;
        }

        return count + 1;
    }
}
