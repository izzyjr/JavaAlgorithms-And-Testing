package arrays;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        String strValue = Arrays.toString(digits).replaceAll("[,\\[\\]\\s]", "");
        int strValueLength = strValue.length();
        BigInteger bigIntValue = new BigInteger(strValue);
        bigIntValue = bigIntValue.add(BigInteger.valueOf(1));
        String strValuePlusOne = bigIntValue.toString();
        int valuePlusOneLength = strValuePlusOne.length();

        int[] digitsModified = new int[valuePlusOneLength];

        for (int i = 0; i < valuePlusOneLength; i++) {
            digitsModified[i] = Integer.parseInt(String.valueOf(strValuePlusOne.charAt(i)));
        }

        return digitsModified;
    }
}
