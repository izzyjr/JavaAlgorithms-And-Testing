public class BoxBlur {

    public static int[][] boxBlur(int[][] image) {

        int length = image.length;
        int dimension = length - 2;
        int[][] blurred = new int[dimension][dimension];
        int count = 0;

        while (count < length) {

            int cols = count;
            int rows = count;
            int three = count + 3;

            for (int i = rows; i < three; i++) {
                for (int j = cols; j < three; j++) {

                }
            }


            count++;
        }

        return blurred;
    }
}
