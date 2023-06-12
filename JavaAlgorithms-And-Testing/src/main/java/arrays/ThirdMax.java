package arrays;

import java.util.Stack;
import java.util.TreeMap;

public class ThirdMax {

    public static int thirdMax(int[] nums) {

        TreeMap<Integer, Integer> tree = new TreeMap<>();

        for (int num : nums) {
            if (!tree.containsKey(num)) {
                tree.put(num, 1);
            }
        }

        Stack<Integer> stack = new Stack<>();

        for (int num : tree.keySet()) {
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
