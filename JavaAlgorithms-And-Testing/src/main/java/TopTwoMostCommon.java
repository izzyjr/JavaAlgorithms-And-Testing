import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TopTwoMostCommon {

    public static int[] topTwoMostCommon(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];

        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        System.out.println(map);

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count < entry.getValue()) {
                count = entry.getValue();
                result[0] = entry.getKey();
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (count <= entry.getValue() && entry.getKey() != result[0]) {
                count = entry.getValue();
                result[1] = entry.getKey();
            }
        }

        System.out.println(Arrays.toString(result));

        return result;
    }
}
