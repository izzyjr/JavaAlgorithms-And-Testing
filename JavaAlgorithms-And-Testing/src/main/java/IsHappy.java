import java.util.HashSet;

public class IsHappy {

    public static boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();
        boolean flag = true;
        int sum = 0;

        while (flag && n != 1) {

            flag = set.add(n);

            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n = n /10;
            }

            n = sum;
        }

        return set.contains(1);
    }
}
