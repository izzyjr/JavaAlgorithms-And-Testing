package arrays;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            int spaces = 0;
            while (flowerbed[i + spaces] < flowerbed.length) {
                if (flowerbed[i + spaces] == 0) {
                    spaces++;
                } else {
                    break;
                }
                if (spaces == 3) {
                    count++;
                    if (i + spaces < flowerbed.length) {
                        i += spaces;
                    }
                    break;
                }
            }
        }

        return count == n;
    }
}
