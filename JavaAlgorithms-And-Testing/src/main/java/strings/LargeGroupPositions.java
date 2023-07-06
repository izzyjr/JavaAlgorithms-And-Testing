package strings;

import java.util.ArrayList;
import java.util.List;

public class LargeGroupPositions {

    public static List<List<Integer>> largeGroupPositions(String s) {

        List<List<Integer>> result = new ArrayList<>();
        int listCount = 0;

        for (int start = 0; start < s.length(); start++) {
            int count = 1;
            int end = start;
            for (int j = start + 1; j < s.length(); j++) {
                if (s.charAt(start) == s.charAt(j)) {
                    count++;
                    end = j;
                } else {
                    break;
                }
            }
            if (count >= 3) {
                result.add(List.of(start, end));
                listCount++;
            }
            start = end;
        }

        return result;
    }
}
