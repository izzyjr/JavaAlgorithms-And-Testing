import java.util.HashSet;

public class IsHappy {

    public static boolean isHappy(int n) {

        String num = Integer.toString(n);
        int squared;
        int sum = 0;
        HashSet<Integer> set = new HashSet<>();
        boolean flag = true;

        while (flag || num.equals("1")) {

            for (int i = 0; i < num.length(); i++) {
                squared = Integer.parseInt(String.valueOf(num.charAt(i)));
                squared *= squared;
                sum += squared;
            }

            flag = set.add(sum);
            num = Integer.toString(sum);
        }

        return set.contains(1);
    }
}
