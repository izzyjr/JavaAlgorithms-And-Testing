public class AreEquallyStrong {

    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        return yourLeft == friendsLeft && yourRight == friendsRight || yourLeft == friendsRight && yourRight == friendsLeft;
    }

    // first attempt solution
    public static boolean areEquallyStrong0(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int[] me = {yourLeft, yourRight};
        int[] friend = {friendsLeft, friendsRight};

        if ((yourLeft + yourRight) == (friendsLeft + friendsRight)) {
            for (int i = 0; i < me.length; i++) {
                for (int j = 0; j < friend.length; j++) {
                    if (me[i] == friend[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
