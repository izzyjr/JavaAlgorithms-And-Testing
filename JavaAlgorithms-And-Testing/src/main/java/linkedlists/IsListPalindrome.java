package linkedlists;

import java.util.Stack;

public class IsListPalindrome {

    public static boolean isListPalindrome(ListNode<Integer> list) {

        Stack<Integer> stack = new Stack<Integer>();

        ListNode<Integer> pointer = list;
        int length = 0;
        while (pointer != null) {
            stack.push(pointer.value);
            pointer = pointer.next;
            length++;
        }

        pointer = list;
        for (int i = 0; i < length / 2; i++) {
            if (!stack.pop().equals(pointer.value)) {
                return false;
            }
            pointer = pointer.next;
        }
        return true;
    }
}
