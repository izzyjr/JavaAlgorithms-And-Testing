package arrays;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {
            int spaces = 0;
            while (flowerbed[i + spaces] < flowerbed.length) {
                if (flowerbed[i + spaces] == 0) {
                    spaces++;
                } else {
                    break;
                }
                if (spaces == 3) {
                    n--;
                    spaces = 1;
                    if (i + spaces < flowerbed.length) {
                        i += spaces;
                    }
                    break;
                }
            }
            if (n == 0) {
                return true;
            }
        }

        return n == 0;
    }
}
