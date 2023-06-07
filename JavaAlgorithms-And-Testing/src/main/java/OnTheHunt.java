import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OnTheHunt {
    public static String onTheHunt(String s, List<String> arr, String csv) {

        String[] arr1 = s.split("");
        String[] arr2 = csv.split(",");

        int arrLength = arr.size();
        int arr1Length = arr1.length;
        int arr2Length = arr2.length;
        int[] lengths  = new int[] {arr1Length, arrLength, arr2Length};
        int longest = 0;

        for (int length : lengths) {
            if (length > longest) {
                longest = length;
            }
        }

        Map<String, Integer> map = new HashMap<>();

        for (int j = 0; j < longest; j++) {
            if (j < arrLength) {
                if (map.containsKey(arr.get(j))) {
                    map.put(arr.get(j), map.get(arr.get(j)) + 1);
                } else {
                    map.put(arr.get(j), 1);
                }
            }
            if (j < arr1Length) {
                if (map.containsKey(arr1[j])) {
                    map.put(arr1[j], map.get(arr1[j]) + 1);
                } else {
                    map.put(arr1[j], 1);
                }
            }
            if (j < arr2Length) {
                if (map.containsKey(arr2[j])) {
                    map.put(arr2[j], map.get(arr2[j]) + 1);
                } else {
                    map.put(arr2[j], 1);
                }
            }
        }

        String result = "";

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 3 == 0) {
                result += entry.getKey();
            }
        }

        return result;
    }
}
