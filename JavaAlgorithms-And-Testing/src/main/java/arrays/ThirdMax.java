package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ThirdMax {

    public static int thirdMax(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            }
        }

        Stack<Integer> stack = new Stack<>();

        for (int num : map.keySet()) {
            stack.push(num);
        }

        if (stack.size() < 3) {
            return stack.pop();
        } else {
            int count = 1;
            while (count != 3) {
                stack.pop();
                count++;
            }
        }

        return stack.pop();
    }
}
