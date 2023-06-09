package strings;

public class ReverseWords {

    public static String reverseWords(String s) {

        String[] arr = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length() - 1; j >= 0; j--) {
                reversed.append(arr[i].charAt(j));
            }
            if (i != arr.length - 1) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }
}
