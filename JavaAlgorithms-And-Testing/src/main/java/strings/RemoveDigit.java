package strings;

public class RemoveDigit {

    public static String removeDigit(String number, char digit) {

        String resultA = "";
        String resultB = "";
        int length = number.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            if (number.charAt(i) != digit || number.charAt(i) == digit && count >= 1) {
                resultA += number.charAt(i);
            } else {
                count++;
            }
        }

        count = 0;

        for (int i = length - 1; i > 0; i--) {
            if (number.charAt(i) != digit || number.charAt(i) == digit && count >= 1) {
                resultB += number.charAt(i);
            } else {
                count++;
            }
        }

        int a = Integer.parseInt(resultA);
        int b = Integer.parseInt(resultB);

        if (a > b) {
            return resultA;
        }

        return resultB;
    }
}
