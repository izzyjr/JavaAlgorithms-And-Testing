package strings;

import java.util.Arrays;

public class CountSegments {

    public static int countSegments(String s) {

        if (s.isEmpty()) {
            return 0;
        }

        String[] arr = s.split("\\s+");
        System.out.println(Arrays.toString(arr));

        return arr.length;
    }
}
