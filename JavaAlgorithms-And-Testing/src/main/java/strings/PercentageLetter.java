package strings;

public class PercentageLetter {

    public static int percentageLetter(String s, char letter) {

        double count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == letter) {
                count++;
            }
        }

        return (int) (count/s.length() * 100);
    }
}
