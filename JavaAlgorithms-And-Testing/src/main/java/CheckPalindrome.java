import java.util.Arrays;

public class CheckPalindrome {

    public static boolean checkPalindrome(String inputString) {

        int lastIndex = inputString.length() - 1;

        for (int i = 0; i < inputString.length() / 2; i++) {
            if (inputString.charAt(i) != inputString.charAt(lastIndex - i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalindrome0(String inputString) {
        int length = inputString.length();
        int countDown = (inputString.length() - 1);
        int count = 0;
        String[] array = inputString.split("");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] +  " : " + array[countDown]);
            if(array[i].equals(array[countDown])) {
                countDown--;
                count++;
            }
        }
        return count == length;
    }
}
