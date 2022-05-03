public class AllLongestStrings {

    public static String[] allLongestStrings(String[] inputArray) {

        int longest = inputArray[0].length();
        int newArraySize = 0;
        int countUp = 0;
        String[] newArray;

        for (int i = 0; i < inputArray.length; i++) {
            if (longest < inputArray[i].length()) {
                longest = inputArray[i].length();
            }
        }

        for (int j = 0; j < inputArray.length; j++) {
            if (longest == inputArray[j].length()) {
                newArraySize++;
            }
        }

        newArray = new String[newArraySize];

        for (int k = 0; k < inputArray.length; k++) {
            if (longest == inputArray[k].length()) {
                if (countUp < newArraySize) {
                    newArray[countUp] = inputArray[k];
                    countUp++;
                }
            }
        }
        return newArray;
    }

}
