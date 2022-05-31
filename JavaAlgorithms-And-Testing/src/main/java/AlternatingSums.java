public class AlternatingSums {

    public static int[] alternatingSums(int[] a) {

        int[] result = new int[2];

        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                result[0] += a[i];
            } else {
                result[1] += a[i];
            }
        }

        return result;
    }
}
