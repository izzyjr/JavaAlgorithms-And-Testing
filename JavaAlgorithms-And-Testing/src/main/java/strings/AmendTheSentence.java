package strings;

public class AmendTheSentence {

    public static String amendTheSentence(String s) {

        String sentence = "";

        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)) && i == 0) {
                sentence = sentence + Character.toLowerCase(s.charAt(i));
            } else if (Character.isUpperCase(s.charAt(i))) {
                sentence = sentence + " " + Character.toLowerCase(s.charAt(i));
            } else {
                sentence = sentence + s.charAt(i);
            }
        }

        return sentence;
    }
}
