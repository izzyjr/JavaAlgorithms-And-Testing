package linkedlists;

import java.util.ArrayList;
import java.util.List;

public class GetDecimalValue {

    public static int getDecimalValue(ListNode<Integer> head) {

        List<Integer> binaries = new ArrayList<>();

        while (head != null) {
            binaries.add(head.value);
            head = head.next;
        }

        int decimal = binaries.get(0);

        for (int i = 1; i < binaries.size(); i++) {
            decimal *= 2;
            decimal += binaries.get(i);
        }

        return decimal;
    }
}
