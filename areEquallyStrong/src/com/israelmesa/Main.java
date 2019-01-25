package com.israelmesa;

public class Main {

    public static void main(String[] args) {

        // test 1: true
        int oneYourLeft = 10;
        int oneYourRight = 15;
        int oneFriendsLeft = 15;
        int oneFriendsRight = 10;

        areEquallyStrong(oneYourLeft, oneYourRight, oneFriendsLeft, oneFriendsRight);


    }

    public static boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

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
