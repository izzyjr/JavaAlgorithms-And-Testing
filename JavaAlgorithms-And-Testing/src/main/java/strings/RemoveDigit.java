package strings;

public class RemoveDigit {

    public static String removeDigit(String number, char digit) {

        int length = number.length();
        String max = "0";

        for (int i = 0; i < length; i++) {
            StringBuilder editable = new StringBuilder(number);
            if (number.charAt(i) == digit) {
                String value = String.valueOf(editable.deleteCharAt(i));
                if (value.compareTo(max) > 0) {
                    max = value;
                }
            }
        }

        return max;
    }
}
