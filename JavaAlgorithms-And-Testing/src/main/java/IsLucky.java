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
}
