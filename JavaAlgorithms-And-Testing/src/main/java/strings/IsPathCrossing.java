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
                currently[0] += 1;
                if (coordinates.containsKey(currently[0])) {
                    if (coordinates.get(currently[0]).contains(currently[1])) {
                        return true;
                    }
                } else {
                    coordinates.put(currently[0], new ArrayList<>(List.of(currently[1])));
                }
            } else if (path.charAt(i) == 'S') {
                currently[0] -= 1;
                if (coordinates.containsKey(currently[0])) {
                    if (coordinates.get(currently[0]).contains(currently[1])) {
                        return true;
                    }
                } else {
                    coordinates.put(currently[0], new ArrayList<>(List.of(currently[1])));
                }
            } else if (path.charAt(i) == 'W') {
                currently[1] -= 1;
                if (coordinates.containsKey(currently[0])) {
                    if (coordinates.get(currently[0]).contains(currently[1])) {
                        return true;
                    } else {
                        coordinates.put(currently[0], new ArrayList<>(List.of(currently[1])));
                    }
                }
            } else if (path.charAt(i) == 'E') {
                currently[1] += 1;
                if (coordinates.containsKey(currently[0])) {
                    if (coordinates.get(currently[0]).contains(currently[1])) {
                        return true;
                    } else {
                        coordinates.put(currently[0], new ArrayList<>(List.of(currently[1])));
                    }
                }
            }
        }

        return false;
    }
}
