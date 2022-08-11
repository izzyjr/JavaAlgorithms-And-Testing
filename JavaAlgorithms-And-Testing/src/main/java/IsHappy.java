import java.util.HashMap;
import java.util.Map;

public class IsHappy {

    public static boolean isHappy(int n) {

        String num = Integer.toString(n);
        int squared;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (!map.containsKey(sum)) {

            for (int i = 0; i < num.length(); i++) {
                squared = Integer.parseInt(String.valueOf(num.charAt(i)));
                squared *= squared;
                sum += squared;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, 1);
            } else {
                return false;
            }
        }

        return true;
    }
}
