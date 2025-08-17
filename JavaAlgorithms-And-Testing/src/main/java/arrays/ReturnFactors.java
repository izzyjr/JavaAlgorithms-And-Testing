package arrays;

import java.util.ArrayList;

public class ReturnFactors {

    public static int[] returnFactors(int number) {

        ArrayList<Integer> factors = new ArrayList<Integer>();
        int[] result;
        
        if (number < 1) {
            result = new int[0];
            return result;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }

        result = new int[factors.size()];
        for (int i = 0; i < factors.size(); i++) {
            result[i] = factors.get(i);
        }

        return result;
    }
}
