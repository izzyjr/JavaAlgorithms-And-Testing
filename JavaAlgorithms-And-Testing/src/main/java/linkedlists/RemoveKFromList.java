package linkedlists;

public class RemoveKFromList {

    public static ListNode<Integer> removeKFromList(ListNode<Integer> head, int k) {

        ListNode<Integer> newHead = new ListNode<>(null);
        newHead.next = head;

        ListNode<Integer> pointer = head;
        ListNode<Integer> previous = newHead;
        while(pointer != null) {
            if(pointer.value == k) {
                previous.next = pointer.next;
            } else {
                previous = pointer;
            }
            pointer = pointer.next;
        }
        return newHead.next;
    }
}
