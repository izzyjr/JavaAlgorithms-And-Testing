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
        int count = 1;
        String fourDigits = "";

        for (int i = 0; i < stringNum.length(); i++) {
            System.out.println(stringNum.charAt(i));
            if (count <= 4) {
                if (fourDigits == "" && stringNum.charAt(i) == '0') {
                    i++;
                } else {
                    fourDigits += stringNum.charAt(i);
                }
                count++;
            } else {
                System.out.println("we made it here: " + fourDigits);
                head.value = Integer.parseInt(fourDigits);
                fourDigits = "";
                head.next = new ListNode<>(0);
                head = head.next;
                count = 1;
            }
        }

        return head;
    }
}
