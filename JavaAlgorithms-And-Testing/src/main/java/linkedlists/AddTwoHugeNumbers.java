package linkedlists;

public class AddTwoHugeNumbers {

    public static ListNode<Integer> addTwoHugeNumbers(ListNode<Integer> a, ListNode<Integer> b) {

        String aSum = "";
        String bSum = "";
        String addLeadingZeros = "";
        ListNode<Integer> pointerA = a;
        ListNode<Integer> pointerB = b;


        while (pointerA != null || pointerB != null) {
            if (pointerA != null) {
                if (pointerA != a) {
                    addLeadingZeros = new String(new char[4 - pointerA.value.toString().length()]).replace('\0', '0');
                }
                aSum += addLeadingZeros + pointerA.value.toString();
                pointerA = pointerA.next;
            }

            if (pointerB != null) {
                if (pointerB != b) {
                    addLeadingZeros = new String(new char[4 - pointerB.value.toString().length()]).replace('\0', '0');
                }
                bSum += addLeadingZeros + pointerB.value.toString();
                pointerB = pointerB.next;
            }
        }

        long num = Long.parseLong(aSum.toString()) + Long.parseLong(bSum.toString());

        System.out.println(num);

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
