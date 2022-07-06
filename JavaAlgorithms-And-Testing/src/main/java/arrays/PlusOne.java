package arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        digits[digits.length - 1] += 1;
        return digits;
    }
}
