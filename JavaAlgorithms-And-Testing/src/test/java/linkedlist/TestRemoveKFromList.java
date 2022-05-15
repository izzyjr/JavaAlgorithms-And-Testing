package linkedlist;

import linkedlists.IsListPalindrome;
import linkedlists.ListNode;
import linkedlists.RemoveKFromList;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TestRemoveKFromList {

    @DataProvider(name="inputOutput")
    private Object[][] getData() {
        return new Object[][]{
                {loadValues(new Integer[] {3, 1, 2, 3, 4, 5}), 3, loadValues(new Integer[] {1, 2, 4, 5})},
                {loadValues(new Integer[] {8, 8, 8, 8, 8}), 8, null},
        };
    }

    @Test(dataProvider = "inputOutput")
    private void testRemoveKFromList(ListNode<Integer> list, int k, ListNode<Integer> expectedResult) {
        assertEquals(RemoveKFromList.removeKFromList(list, k), expectedResult);
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
