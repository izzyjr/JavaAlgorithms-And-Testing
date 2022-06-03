package linkedlists;

import java.util.Stack;

public class AddTwoHugeNumbers {

    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

        ListNode<Integer> pointerA = a;
        ListNode<Integer> pointerB = b;
        Stack<Integer> stackA = new Stack<>();
        Stack<Integer> stackB = new Stack<>();


        while (pointerA != null || pointerB != null) {
            if (pointerA != null) {
                stackA.push(pointerA.value);
                pointerA = pointerA.next;
            }
            if (pointerB != null) {
                stackB.push(pointerB.value);
                pointerB = pointerB.next;
            }
        }

        ListNode<Integer> head = new ListNode<>(0);
        Integer aPop = 0;
        Integer bPop = 0;
        Integer carry = 0;

        while (!stackA.isEmpty() || !stackB.isEmpty() || carry != 0) {
            if (!stackA.isEmpty()) {
                aPop = stackA.pop();
            } else {
                aPop = 0;
            }
            if (!stackB.isEmpty()) {
                bPop = stackB.pop();
            } else {
                bPop = 0;
            }
            int sum = (aPop + bPop + carry);
            int mod = sum % 10000;

            if (sum < 10000) {
                head.value = mod;
                carry = 0;
            } else if (sum == 10000) {
                head.value = mod;
                carry = sum/10000;
            } else {
                head.value = mod;
                carry = sum/10000;
            }

            ListNode<Integer> previous = new ListNode<>(0);
            previous.next = head;
            head = previous;
        }

        return head.next;
    }
}
