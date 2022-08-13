import java.util.HashSet;

public class IsHappy {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while (!set.contains(n) && n != 1) {
            set.add(n);
            n = next(n);
        }

        return n == 1;
    }

    private static int next(int n) {

        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n = n /10;
        }

        return sum;
    }
}
