package strings;

public class CountSegments {

    public static int countSegments(String s) {

        s = s.trim();

        if (s.isEmpty()) {
            return 0;
        }

        return s.split("\\s+").length;
    }
}
