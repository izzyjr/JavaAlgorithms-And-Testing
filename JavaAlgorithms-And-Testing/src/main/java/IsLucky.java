public class IsLucky {

    public static boolean isLucky(int n) {

        String str = Integer.toString(n);
        String[] strArray = str.split("");
        int sumA = 0;
        int sumB = 0;

        for (int i = 0; i < strArray.length; i++) {
            if (i < strArray.length / 2) {
                sumA += Integer.parseInt(strArray[i]);
            } else {
                sumB += Integer.parseInt(strArray[i]);
            }
        }
        return sumA == sumB;
    }

    // Variation - If sum of first three digits equals sum of last three return True(lucky)
    public static boolean isLucky2(int n) {

        String str = Integer.toString(n);
        String[] strArray = str.split("");
        int length = strArray.length;

        int sumA = Integer.parseInt(strArray[0]) + Integer.parseInt(strArray[1]) + Integer.parseInt(strArray[2]);
        int sumB = Integer.parseInt(strArray[length -1]) + Integer.parseInt(strArray[length - 2]) + Integer.parseInt(strArray[length - 3]);

        return sumA == sumB;
    }
}
