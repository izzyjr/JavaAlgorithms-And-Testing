public class IsHappy {

    public static boolean isHappy(int n) {

        String num = Integer.toString(n);
        int squared;
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {
            squared = Integer.parseInt(String.valueOf(num.charAt(i)));
            squared *= squared;
            sum += squared;
        }

        return sum == 1;
    }
}
