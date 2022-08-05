public class NumberOfCharactersString {

    public static String numberOfCharactersString(String str) {

        Character current = str.charAt(0);
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (current != str.charAt(i)) {
                result.append(current);
                result.append(count);
                current = str.charAt(i);
                count = 1;
            } else if (current == str.charAt(i)) {
                count++;
            }
        }

        result.append(current);
        result.append(count);

        return result.toString();
    }

}
