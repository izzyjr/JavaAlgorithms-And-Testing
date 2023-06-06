package strings;

public class CountSegments {

    public static int countSegments(String s) {

        if (s.isEmpty()) {
            return 0;
        }
        return s.split(" ").length;
    }
}
