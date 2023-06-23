package arrays;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String s, int k) {

        StringBuilder format = new StringBuilder();

        for (int i = s.length() - 1; i > 0; i--) {
            int count = 0;
            while (count < k) {
                if (s.charAt(i) == '-') {
                    i--;
                } else {
                    format.append(Character.toUpperCase(s.charAt(i)));
                    i--;
                    count++;
                }
            }
            format.append('-');
            if (i <= k) {
                while (i >= 0) {
                    if (s.charAt(i) != '-') {
                        format.append(Character.toUpperCase(s.charAt(i)));
                    }
                    i--;
                }
            }
        }

        return format.reverse().toString();
    }
}
