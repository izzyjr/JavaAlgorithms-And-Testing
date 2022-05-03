import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommonCharacterCount {

    public static int commonCharacterCount(String s1, String s2) {

        int count = 0;
        StringBuilder s2String = new StringBuilder(s2);

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2String.length(); j++) {
                if (s1.charAt(i) == s2String.charAt(j)) {
                    count++;
                    s2String.deleteCharAt(j);
                    j = 0;
                    break;
                }
            }
        }
        return count;
    }

    // solution of first attempt
    public static int commonCharacterCount0(String s1, String s2) {

        int count = 0;
        List<String> stringListOne = new ArrayList<String>(Arrays.asList(s1.split("")));
        List<String> stringListTwo = new ArrayList<String>(Arrays.asList(s2.split("")));

        for (int i = 0; i < stringListOne.size(); i++) {
            for (int j = 0; j < stringListTwo.size(); j++) {
                if (stringListOne.get(i).equals(stringListTwo.get(j))) {
                    stringListOne.remove(i);
                    i = 0;
                    stringListTwo.remove(j);
                    j = -1;
                    count++;
                    if (stringListOne.size() == 0 || stringListTwo.size() == 0) {
                        break;
                    }
                }
            }
        }
        return count;
    }

}
