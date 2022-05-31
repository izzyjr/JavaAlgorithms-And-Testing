package linkedlists;

public class AddTwoHugeNumbers {

    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

        String aSum = "";
        String bSum = "";

        while (a != null || b != null) {
            if (a != null) {
                aSum += a.value.toString();
                a = a.next;
            }

            if (b != null) {
                bSum += b.value.toString();
                b = b.next;
            }
        }

        long num = Long.parseLong(aSum.toString()) + Long.parseLong(bSum.toString());
        String stringNum = String.valueOf(num);
        ListNode<Integer> head = new ListNode<>(0);
        ListNode<Integer> pointer = head;

        int count = 0;
        String fourDigits = "";

        for (int i = 0; i < stringNum.length(); i++) {
            if (count < 4) {
                if (fourDigits == "" && stringNum.charAt(i) == '0') {
                    i++;
                    count++;
                } else {
                    fourDigits += stringNum.charAt(i);
                    count++;
                }
                if (count == 4) {
                    pointer.value = Integer.parseInt(fourDigits);
                    fourDigits = "";
                    pointer.next = new ListNode<>(0);
                    pointer = pointer.next;
                    count = 0;
                }
            }
        }

        return head;
    }
}
