package strings;

public class RemoveDigit {

    public static String removeDigit(String number, char digit) {

        String result = "";
        int length = number.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (number.charAt(i) != digit || number.charAt(i) == digit && count >= 1) {
                result += number.charAt(i);
            } else {
                count++;
            }
        }

        System.out.println(count);

        return result;
    }
}
