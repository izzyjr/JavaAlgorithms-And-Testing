package linkedlists;

public class GetDecimalValue {

    public static int getDecimalValue(ListNode<Integer> head) {

        int decimal = head.value;

        while (head.next != null) {
            decimal *= 2;
            head = head.next;
            decimal += head.value;
        }

        return decimal;
    }
}
