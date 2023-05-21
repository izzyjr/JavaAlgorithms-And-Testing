package arrays;

public class ReverseArray {

    public static char[] reverseArray(char[] s) {

        int half = s.length / 2;
        int decrease = s.length - 1;

        for (int i = 0; i < half; i++) {
            char temp = s[decrease];
            s[decrease] = s[i];
            s[i] = temp;
            decrease--;
        }

        return s;
    }
}
