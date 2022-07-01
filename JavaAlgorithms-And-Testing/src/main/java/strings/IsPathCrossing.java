package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IsPathCrossing {

    public static boolean isPathCrossing(String path) {

        Map<Integer, ArrayList<Integer>> coordinates = new HashMap<>();
        coordinates.put(0, new ArrayList<>(List.of(0)));
        int[] currently = {0, 0};

        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'N') {
                
            } else if (path.charAt(i) == 'S') {

            } else if (path.charAt(i) == 'W') {

            } else if (path.charAt(i) == 'E') {

            }
        }

        return false;
    }
}
