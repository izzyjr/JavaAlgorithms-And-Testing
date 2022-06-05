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
}
