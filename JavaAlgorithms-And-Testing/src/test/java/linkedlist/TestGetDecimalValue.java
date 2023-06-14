package linkedlist;

import linkedlists.GetDecimalValue;
import linkedlists.IsListPalindrome;
import linkedlists.ListNode;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestGetDecimalValue {
    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {loadValues(new Integer[] {1, 0, 1}), 5},
                {loadValues(new Integer[] {0}), 0},
                {loadValues(new Integer[] {1, 0, 0, 1, 1, 0, 1, 0, 0, 1}), 617},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testGetDecimalValue(ListNode<Integer> list, int expectedResult) {
        assertEquals(GetDecimalValue.getDecimalValue(list), expectedResult);
    }

    private static ListNode<Integer> loadValues(Integer[] array) {
        int i = 0;
        ListNode<Integer> head = new ListNode<>(array[i]);
        ListNode<Integer> pointer = head;
        while (++i < array.length) {
            pointer.next = new ListNode<>(array[i]);
            pointer = pointer.next;
        }
        return head;
    }
}
