package arrays;

public class CanPlaceFlowers {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (flowerbed[0] == 1) {
            for (int i = 0; i < flowerbed.length; i++) {
                if (i % 2 == 0 && flowerbed[i] == 0) {
                    if (i + 1 < flowerbed.length) {
                        if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                            n--;
                        }
                    }
                }
                if (n == 0) {
                    return true;
                }
            }
        } else {
            for (int i = 0; i < flowerbed.length; i++) {
                if (i % 2 != 0 && flowerbed[i] == 0) {
                    if (i + 1 < flowerbed.length) {
                        if (flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                            n--;
                        }
                    }
                }
                if (n == 0) {
                    return true;
                }
            }
        }

        return false;
    }
}
