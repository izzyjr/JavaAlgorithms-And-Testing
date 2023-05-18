package strings;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {

        String[] list = s.split(" ");
        return list[list.length - 1].length();
    }
}
