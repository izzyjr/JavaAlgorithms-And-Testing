package arrays;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder format = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '-') {
                format.append(Character.toUpperCase(s.charAt(i)));
            }
        }

        int firstPart = format.length() % k;
        StringBuilder result = new StringBuilder();

        if (firstPart != 0) {
            result.append(format, 0, firstPart);
        }

        int counter = 0;

        for (int j = firstPart; j < format.length(); j++) {
            if (counter % k == 0 && counter != firstPart) {
                result.append('-');
            }
            result.append(format.charAt(j));
            counter++;
        }

        return result.toString();
    }
}
