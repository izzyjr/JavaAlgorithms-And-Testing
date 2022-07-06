package arrays;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String strValue = Arrays.toString(digits).replaceAll("[,\\[\\]\\s]", "");
        int strValueLength = strValue.length();
        long longValue = Long.parseLong(strValue) + 1;
        String strValuePlusOne = Long.toString(longValue);
        int valuePlusOneLength = strValuePlusOne.length();

        int[] digitsModified = new int[valuePlusOneLength];

        for (int i = 0; i < valuePlusOneLength; i++) {
            digitsModified[i] = Integer.parseInt(String.valueOf(strValuePlusOne.charAt(i)));
        }

        return digitsModified;
    }
}
