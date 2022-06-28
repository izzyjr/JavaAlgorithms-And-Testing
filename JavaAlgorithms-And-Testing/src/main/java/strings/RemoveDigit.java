package strings;

public class RemoveDigit {

    public static String removeDigit(String number, char digit) {

        int length = number.length();
        long max = 0;

        for (int i = 0; i < length; i++) {
            StringBuilder editable = new StringBuilder(number);
            if (number.charAt(i) == digit) {
                long value = Long.parseLong(String.valueOf(editable.deleteCharAt(i)));
                if (value > max) {
                    max = value;
                }
            }
        }

        return String.valueOf(max);
    }
}
