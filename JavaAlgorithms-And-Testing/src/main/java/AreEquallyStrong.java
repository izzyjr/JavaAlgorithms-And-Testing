public class AreEquallyStrong {

    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int myStrongest = 0;
        int myWeakest = 0;
        int friendsStrongest = 0;
        int friendsWeakest = 0;

        if (yourLeft >= yourRight) {
            myStrongest = yourLeft;
            myWeakest = yourRight;
        } else {
            myStrongest = yourRight;
            myWeakest = yourLeft;
        }

        if (friendsLeft >= friendsRight) {
            friendsStrongest = friendsLeft;
            friendsWeakest = friendsRight;
        } else {
            friendsStrongest = friendsRight;
            friendsWeakest = friendsLeft;
        }

        return myStrongest == friendsStrongest && myWeakest == friendsWeakest;
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
