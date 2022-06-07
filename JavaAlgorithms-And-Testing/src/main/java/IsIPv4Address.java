public class IsIPv4Address {

    public static boolean isIPv4Address(String inputString) {

        String[] nums = inputString.split("\\.");
        int length = nums.length;

        if (length != 4) {
            return false;
        }

        for (String num : nums) {
            try {
                if (Integer.parseInt(num) < 0 || Integer.parseInt(num) > 255) {
                    return false;
                }
            } catch (NumberFormatException numberFormatException) {
                System.out.println(numberFormatException + ". Not parsable.");
                return false;
            }

            if (num.charAt(0) == '0' && num.length() > 1) {
                return false;
            }
        }

        return true;
    }
}
