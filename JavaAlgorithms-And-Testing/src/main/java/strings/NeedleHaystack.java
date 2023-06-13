package strings;

public class NeedleHaystack {

    public static int needleHaystack(String haystack, String needle) {

        for (int i = 0; i < haystack.length(); i++) {
            if (needle.charAt(0) == haystack.charAt(i)) {
                int j = 1;
                int count = 1;
                while (j < needle.length() && i + j < haystack.length()) {
                    if (needle.charAt(j) == haystack.charAt(i + j)) {
                        count++;
                        j++;
                    } else {
                        break;
                    }
                }
                if (count == needle.length()) {
                    return i;
                }
            }
        }

        return -1;
    }
}
