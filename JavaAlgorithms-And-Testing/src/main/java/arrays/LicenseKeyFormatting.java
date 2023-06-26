package arrays;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder format = new StringBuilder();
        int charactersCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                charactersCount++;
            } else {
                format.append(s.charAt(i));
            }
        }

        int firstPart = (s.length() - charactersCount) % k;
        StringBuilder result = new StringBuilder();

        if (firstPart != 0) {
            result.append(format, 0, k - 1);
        }

        int counter = 0;
        for (int j = firstPart; j < format.length(); j++) {
            if (counter % k == 0) {
                result.append('-');
            }
            result.append(Character.toUpperCase(format.charAt(j)));
            counter++;
        }

        return result.toString();
    }
}
